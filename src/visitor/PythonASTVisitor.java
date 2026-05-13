package visitor;

import SymbolTable.SymbolTable;
import SymbolTable.Row;
import errors.ScopeError;
import errors.UndefinedSymbolError;
import gen.Parser_Python;
import gen.Parser_PythonBaseVisitor;
import ast.ASTNode;
import ast.ast_Python.ProgramNode;
import ast.ast_Python.statement.*;
import ast.ast_Python.expression.*;
import java.util.ArrayList;
import java.util.List;

public class PythonASTVisitor extends Parser_PythonBaseVisitor<ASTNode> {

    private final SymbolTable symbolTable = new SymbolTable();
    private SymbolTable currentScope = symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public PythonASTVisitor() {
        defineGlobalSymbol("__name__", "Builtin", "__main__");
        defineGlobalSymbol("None", "BuiltinLiteral", null);
        defineGlobalSymbol("True", "BuiltinLiteral", "True");
        defineGlobalSymbol("False", "BuiltinLiteral", "False");
    }

    private void enterScope(String scopeName) {
        currentScope = currentScope.enterScope(scopeName);
    }

    private void exitScope() {
        currentScope = currentScope.exitScope();
    }

    private void defineGlobalSymbol(String name, String type, String value) {
        Row row = new Row();
        row.setName(name);
        row.setType(type);
        row.setValue(value);
        symbolTable.define(row);
    }

    private void defineSymbol(String name, String type, String value) {
        Row row = new Row();
        row.setName(name);
        row.setType(type);
        row.setValue(value);
        currentScope.define(row);
    }

    private void assignSymbol(String name, String type, String value) {
        Row existing = currentScope.getRowInCurrentScope(name);
        if (existing != null) {
            existing.setType(type);
            existing.setValue(value);
            return;
        }

        Row row = new Row();
        row.setName(name);
        row.setType(type);
        row.setValue(value);
        currentScope.define(row);
    }

    private void resolveSymbol(String name, int line) {
        if (name == null || isPythonLiteralName(name)) {
            return;
        }

        currentScope.resolve(name, line);
    }

    private boolean isPythonLiteralName(String name) {
        return "None".equals(name) || "True".equals(name) || "False".equals(name);
    }

    private String buildQualifiedName(Parser_Python.Function_nameContext nameCtx) {
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < nameCtx.CHARACTERS().size(); i++) {
            if (i > 0) {
                nameBuilder.append(".");
            }
            nameBuilder.append(nameCtx.CHARACTERS(i).getText());
        }

        if (nameCtx.CHARACTERS().size() > 0) {
            resolveSymbol(nameCtx.CHARACTERS(0).getText(), nameCtx.getStart().getLine());
        }

        return nameBuilder.toString();
    }

    @Override
    public ASTNode visitProgram(Parser_Python.ProgramContext ctx) {
        currentScope = symbolTable;
        ProgramNode program = new ProgramNode(ctx.getStart().getLine());
        
        if (ctx.statement() != null) {
            for (Parser_Python.StatementContext stmtCtx : ctx.statement()) {
                ASTNode result = visit(stmtCtx);
                if (result instanceof StatementNode) {
                    program.addStatement((StatementNode) result);
                }
            }
        }
        
        return program;
    }

    @Override
    public ASTNode visitImportStmt(Parser_Python.ImportStmtContext ctx) {
        return visit(ctx.import_statement());
    }

    @Override
    public ASTNode visitRouteStmt(Parser_Python.RouteStmtContext ctx) {
        return visit(ctx.route());
    }

    @Override
    public ASTNode visitFunctionDefStmt(Parser_Python.FunctionDefStmtContext ctx) {
        return visit(ctx.function_defination());
    }

    @Override
    public ASTNode visitGlobalAssignmentStmt(Parser_Python.GlobalAssignmentStmtContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public ASTNode visitGlobalIfStmt(Parser_Python.GlobalIfStmtContext ctx) {
        return visit(ctx.if_statement());
    }

    @Override
    public ASTNode visitImport_statement(Parser_Python.Import_statementContext ctx) {
        if (ctx.import_flask() != null) {
            return visit(ctx.import_flask());
        } else if (ctx.import_json() != null) {
            return visit(ctx.import_json());
        }
        return null;
    }

    @Override
    public ASTNode visitImport_flask(Parser_Python.Import_flaskContext ctx) {
        int line = ctx.getStart().getLine();
        String moduleName = ctx.CHARACTERS(0).getText();
        List<String> importedNames = new ArrayList<>();
        
        for (int i = 1; i < ctx.CHARACTERS().size(); i++) {
            importedNames.add(ctx.CHARACTERS(i).getText());
        }

        defineSymbol(moduleName, "ImportModule", moduleName);
        for (String importedName : importedNames) {
            defineSymbol(importedName, "Import", moduleName);
        }
        
        return new ImportNode(moduleName, importedNames, line);
    }

    @Override
    public ASTNode visitImport_json(Parser_Python.Import_jsonContext ctx) {
        int line = ctx.getStart().getLine();
        List<String> importedNames = new ArrayList<>();
        importedNames.add("json");

        defineSymbol("json", "ImportModule", "json");

        return new ImportNode("json", importedNames, line);
    }

    @Override
    public ASTNode visitRoute(Parser_Python.RouteContext ctx) {
        int line = ctx.getStart().getLine();
        Parser_Python.Route_parameterContext paramCtx = ctx.route_parameter();
        
        if (paramCtx != null && paramCtx.route_parameter_body() != null) {
            Parser_Python.Route_parameter_bodyContext bodyCtx = paramCtx.route_parameter_body();
            String path = bodyCtx.STRING().getText();
            // Remove quotes
            path = path.substring(1, path.length() - 1);
            
            RouteNode routeNode = new RouteNode(path, line);
            
            // Check for methods option
            if (bodyCtx.route_parameter_options() != null) {
                Parser_Python.Route_parameter_optionsContext optionsCtx = bodyCtx.route_parameter_options();
                if (optionsCtx.array() != null) {
                    Parser_Python.ArrayContext arrayCtx = optionsCtx.array();
                    if (arrayCtx.array_items() != null) {
                        for (org.antlr.v4.runtime.tree.TerminalNode strNode : arrayCtx.array_items().STRING()) {
                            String method = strNode.getText();
                            method = method.substring(1, method.length() - 1);
                            routeNode.addMethod(method);
                        }
                    }
                }
            }
            
            return routeNode;
        }
        
        return null;
    }

    @Override
    public ASTNode visitFunction_defination(Parser_Python.Function_definationContext ctx) {
        int line = ctx.getStart().getLine();
        String functionName = ctx.CHARACTERS() != null ? ctx.CHARACTERS().getText() : "";
        
        FunctionNode functionNode = new FunctionNode(functionName, line);

        if (!functionName.isEmpty()) {
            defineSymbol(functionName, "Function", null);
        }

        enterScope(functionName.isEmpty() ? "function@" + line : functionName);

        try {
            // Visit function parameters in the function scope
            if (ctx.function_parameter() != null && ctx.function_parameter().set_function_parameter() != null) {
                Parser_Python.Set_function_parameterContext paramsCtx = ctx.function_parameter().set_function_parameter();
                for (org.antlr.v4.runtime.tree.TerminalNode param : paramsCtx.CHARACTERS()) {
                    functionNode.addParameter(param.getText());

                    defineSymbol(param.getText(), "Parameter", functionName);
                }
            }

            // Visit function body
            if (ctx.function_body() != null) {
                Parser_Python.Function_bodyContext bodyCtx = ctx.function_body();
                // Only visit statement_in_function contexts, ignore NEWLINE tokens
                if (bodyCtx.statement_in_function() != null) {
                    for (Parser_Python.Statement_in_functionContext stmtCtx : bodyCtx.statement_in_function()) {
                        ASTNode result = visit(stmtCtx);
                        if (result instanceof StatementNode) {
                            functionNode.addStatement((StatementNode) result);
                        }
                    }
                }
            }
        } finally {
            exitScope();
        }
        
        return functionNode;
    }

    @Override
    public ASTNode visitReturnStmt(Parser_Python.ReturnStmtContext ctx) {
        return visit(ctx.return_statement());
    }

    @Override
    public ASTNode visitAssignmentStmt(Parser_Python.AssignmentStmtContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public ASTNode visitIfStmt(Parser_Python.IfStmtContext ctx) {
        return visit(ctx.if_statement());
    }

    @Override
    public ASTNode visitForStmt(Parser_Python.ForStmtContext ctx) {
        return visit(ctx.for_loop());
    }

    @Override
    public ASTNode visitWithStmt(Parser_Python.WithStmtContext ctx) {
        return visit(ctx.with_open());
    }

    @Override
    public ASTNode visitFunctionCallStmt(Parser_Python.FunctionCallStmtContext ctx) {
        ASTNode result = visit(ctx.function_call());
        if (result instanceof CallNode) {
            // Wrap function call in a statement node
            return new FunctionCallStatementNode((CallNode) result);
        }
        return result;
    }

    @Override
    public ASTNode visitBreakStmt(Parser_Python.BreakStmtContext ctx) {
        int line = ctx.getStart().getLine();
        return new BreakNode(line);
    }

    @Override
    public ASTNode visitReturn_statement(Parser_Python.Return_statementContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode value = null;
        
        if (ctx.expression() != null) {
            ASTNode result = visit(ctx.expression());
            if (result instanceof ExpressionNode) {
                value = (ExpressionNode) result;
            }
        }
        
        return new ReturnNode(value, line);
    }

    @Override
    public ASTNode visitAssignment(Parser_Python.AssignmentContext ctx) {
        int line = ctx.getStart().getLine();
    
        if (ctx.CHARACTERS() == null) {
            return null;
        }
    
        String variable = ctx.CHARACTERS().getText();
            if (ctx.expression() == null) {
            return null;
        }
    
        ASTNode result = visit(ctx.expression());
        if (!(result instanceof ExpressionNode)) {
            return null;
        }
        String value = ctx.expression().getText();
        assignSymbol(variable, "VariableAssign", value);
        return new AssignmentNode(line, variable, (ExpressionNode) result);
    }

    @Override
    public ASTNode visitIf_statement(Parser_Python.If_statementContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode condition = null;
        
        if (ctx.expression() != null) {
            ASTNode result = visit(ctx.expression());
            if (result instanceof ExpressionNode) {
                condition = (ExpressionNode) result;
            }
        }
        
        IfNode ifNode = new IfNode(condition, line);

        enterScope("if@" + line);
        try {
            if (ctx.statement_in_function() != null) {
                for (Parser_Python.Statement_in_functionContext stmtCtx : ctx.statement_in_function()) {
                    ASTNode result = visit(stmtCtx);
                    if (result instanceof StatementNode) {
                        ifNode.addStatement((StatementNode) result);
                    }
                }
            }
        } finally {
            exitScope();
        }
        
        return ifNode;
    }


    @Override
    public ASTNode visitFor_loop(Parser_Python.For_loopContext ctx) {
        int line = ctx.getStart().getLine();
        String variable = ctx.CHARACTERS(0).getText();
        String iterable = ctx.CHARACTERS(1).getText();

        resolveSymbol(iterable, line);
        
        ForNode forNode = new ForNode(variable, iterable, line);

        enterScope("for@" + line);
        try {
            defineSymbol(variable, "ForLoopVariable", iterable);

            if (ctx.statement_in_function() != null) {
                for (Parser_Python.Statement_in_functionContext stmtCtx : ctx.statement_in_function()) {
                    ASTNode result = visit(stmtCtx);
                    if (result instanceof StatementNode) {
                        forNode.addStatement((StatementNode) result);
                    }
                }
            }
        } finally {
            exitScope();
        }
        
        return forNode;
    }

    @Override
    public ASTNode visitWith_open(Parser_Python.With_openContext ctx) {
        int line = ctx.getStart().getLine();
        List<String> files = new ArrayList<>();
        String alias = "";
        
        if (ctx.with_parameter() != null) {
            for (org.antlr.v4.runtime.tree.TerminalNode strNode : ctx.with_parameter().STRING()) {
                String file = strNode.getText();
                file = file.substring(1, file.length() - 1);
                files.add(file);
            }
        }
        
        if (ctx.CHARACTERS() != null && ctx.CHARACTERS().getText() != null) {
            alias = ctx.CHARACTERS().getText();
        }
        
        WithNode withNode = new WithNode(files, alias, line);

        enterScope("with@" + line);
        try {
            if (!alias.isEmpty()) {
                defineSymbol(alias, "WithAlias", files.isEmpty() ? null : files.get(0));
            }

            // Visit statements in the with block body
            if (ctx.statement_in_function() != null) {
                for (Parser_Python.Statement_in_functionContext stmtCtx : ctx.statement_in_function()) {
                    ASTNode result = visit(stmtCtx);
                    if (result instanceof StatementNode) {
                        withNode.addStatement((StatementNode) result);
                    }
                }
            }
        } finally {
            exitScope();
        }
        
        return withNode;
    }

    @Override
    public ASTNode visitFunction_call(Parser_Python.Function_callContext ctx) {
        int line = ctx.getStart().getLine();
        String functionName = "";
        List<ExpressionNode> arguments = new ArrayList<>();

        if (ctx.function_name() != null) {
            Parser_Python.Function_nameContext nameCtx = ctx.function_name();
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < nameCtx.CHARACTERS().size(); i++) {
                if (i > 0) {
                    nameBuilder.append(".");
                }
                nameBuilder.append(nameCtx.CHARACTERS(i).getText());
            }
            functionName = nameBuilder.toString();
        }

        if (ctx.argument_list() != null) {
            for (Parser_Python.ArgumentContext argCtx : ctx.argument_list().argument()) {

                if (argCtx.expression() != null) {
                    ASTNode result = visit(argCtx.expression());
                    if (result instanceof ExpressionNode) {
                        arguments.add((ExpressionNode) result);
                    }
                }
                else if (argCtx.key_value() != null) {
                    Parser_Python.Key_valueContext kvCtx = argCtx.key_value();
                    if (kvCtx.expression() != null) {
                        ASTNode result = visit(kvCtx.expression());
                        if (result instanceof ExpressionNode) {
                            arguments.add((ExpressionNode) result);
                        }
                    }
                }
            }
        }

        return new CallNode(functionName, arguments, line);
    }


    @Override
    public ASTNode visitOther_expression(Parser_Python.Other_expressionContext ctx) {
        if (ctx.function_call() != null) {
            return visit(ctx.function_call());
        } else if (ctx.index_access() != null) {
            return visit(ctx.index_access());
        } else if (ctx.CHARACTERS() != null) {
            int line = ctx.getStart().getLine();
            String name = ctx.CHARACTERS().getText();
            if (!isPythonLiteralName(name)) {
                resolveSymbol(name, line);
            }
            return name != null ? new NameNode(name, line) : null;
        } else if (ctx.function_name() != null) {
            int line = ctx.getStart().getLine();
            Parser_Python.Function_nameContext nameCtx = ctx.function_name();
            String qualifiedName = buildQualifiedName(nameCtx);
            return new NameNode(qualifiedName, line);
        } else if (ctx.NUMBERS() != null) {
            int line = ctx.getStart().getLine();
            try {
                int value = Integer.parseInt(ctx.NUMBERS().getText());
                return new NumberNode(value, line);
            } catch (NumberFormatException e) {
                return new NumberNode(0, line);
            }
        } else if (ctx.STRING() != null) {
            int line = ctx.getStart().getLine();
            String value = ctx.STRING().getText();
            if (value != null && value.length() >= 2) {
                // Remove quotes
                value = value.substring(1, value.length() - 1);
                return new StringNode(value, line);
            }
            return new StringNode("", line);
        } else if (ctx.function_array() != null) {
            // Handle function_array: function_call[STRING]
            // Treat it as a function call
            return visit(ctx.function_array().function_call());
        }
        return null;
    }

    @Override
    public ASTNode visitFunction_array(Parser_Python.Function_arrayContext ctx) {
        // function_array: function_call LEFT_ARRAY STRING RIGHT_ARRAY
        // This handles expressions like json.load(f)["products"]
        // Return the function call result - index access will be handled at a higher level if needed
        return visit(ctx.function_call());
    }

    @Override
    public ASTNode visitIndex_access(Parser_Python.Index_accessContext ctx) {
        int line = ctx.getStart().getLine();
        String variableName = ctx.CHARACTERS() != null ? ctx.CHARACTERS().getText() : "";
        String index = "";

        if (!variableName.isEmpty() && !isPythonLiteralName(variableName)) {
            resolveSymbol(variableName, line);
        }
        
        if (ctx.STRING() != null) {
            String indexStr = ctx.STRING().getText();
            if (indexStr != null && indexStr.length() >= 2) {
                // Remove quotes
                index = indexStr.substring(1, indexStr.length() - 1);
            }
        }
        
        return new iIndexAccessNode(variableName, index, line);
    }

    @Override
    public ASTNode visitEmptyList(Parser_Python.EmptyListContext ctx) {
        int line = ctx.getStart().getLine();
        return new ListNode(new ArrayList<>(), line);
    }

    @Override
    public ASTNode visitNonEmptyList(Parser_Python.NonEmptyListContext ctx) {
        int line = ctx.getStart().getLine();
        List<ExpressionNode> elements = new ArrayList<>();
        
        if (ctx.list_items() != null) {
            for (Parser_Python.ExpressionContext exprCtx : ctx.list_items().expression()) {
                ASTNode result = visit(exprCtx);
                if (result instanceof ExpressionNode) {
                    elements.add((ExpressionNode) result);
                }
            }
        }
        
        return new ListNode(elements, line);
    }

    @Override
    public ASTNode visitCurly_argument(Parser_Python.Curly_argumentContext ctx) {
        int line = ctx.getStart().getLine();
        DictNode dictNode = new DictNode(line);
        
        if (ctx.curly_items() != null) {
            for (Parser_Python.Curly_itemContext itemCtx : ctx.curly_items().curly_item()) {
                // Handle dictionary item: key: value
                String key = "";
                ExpressionNode value = null;
                
                if (itemCtx.STRING() != null) {
                    String keyStr = itemCtx.STRING().getText();
                    key = keyStr.substring(1, keyStr.length() - 1); // Remove quotes
                } else if (itemCtx.CHARACTERS() != null) {
                    key = itemCtx.CHARACTERS().getText();
                }
                
                if (itemCtx.expression() != null) {
                    ASTNode exprResult = visit(itemCtx.expression());
                    if (exprResult instanceof ExpressionNode) {
                        value = (ExpressionNode) exprResult;
                    }
                }
                
                if (!key.isEmpty()) {
                    dictNode.addItem(key, value);
                }
            }
        }
        
        return dictNode;
    }

    @Override
    public ASTNode visitCurly_item(Parser_Python.Curly_itemContext ctx) {
        // This is handled in visitCurly_argument
        // Return the expression value for consistency
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        return null;
    }

    @Override
    public ASTNode visitKey_value(Parser_Python.Key_valueContext ctx) {
        // For key=value arguments in function calls, return the expression value
        // The key name information could be preserved in a future enhancement
        if (ctx.expression() != null) {
            ASTNode result = visit(ctx.expression());
            return result;
        }
        return null;
    }

    @Override
    public ASTNode visitArithmeticExpr(Parser_Python.ArithmeticExprContext ctx){
        int line = ctx.getStart().getLine();
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.getChild(1).getText();
    return new BinaryOpNode(left, op, right, line);
    }
    @Override
    public ASTNode visitComparisonExpr(Parser_Python.ComparisonExprContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.comparison_operator().getText();

        return new BinaryOpNode(left, op, right, line);
    }
    @Override
    public ASTNode visitAtomExpr(Parser_Python.AtomExprContext ctx) {
        return visit(ctx.other_expression());
    }
    @Override
    public ASTNode visitListExpr(Parser_Python.ListExprContext ctx) {
        return visit(ctx.list());
    }

    @Override
    public ASTNode visitDictExpr(Parser_Python.DictExprContext ctx) {
        return visit(ctx.curly_argument());
    }

    @Override
    public ASTNode visitParenExpr(Parser_Python.ParenExprContext ctx) {
        return visit(ctx.expression());
    }
}
