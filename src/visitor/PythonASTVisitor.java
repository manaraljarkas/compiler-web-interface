package visitor;

import gen.Parser_Python;
import gen.Parser_PythonBaseVisitor;
import ast.ASTNode;
import ast.ast_Python.ProgramNode;
import ast.ast_Python.statement.*;
import ast.ast_Python.expression.*;
import java.util.ArrayList;
import java.util.List;

public class PythonASTVisitor extends Parser_PythonBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(Parser_Python.ProgramContext ctx) {
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
        
        return new ImportNode(moduleName, importedNames, line);
    }

    @Override
    public ASTNode visitImport_json(Parser_Python.Import_jsonContext ctx) {
        int line = ctx.getStart().getLine();
        List<String> importedNames = new ArrayList<>();
        importedNames.add("json");
        return new ImportNode("json", importedNames, line);
    }

    @Override
    public ASTNode visitRoute(Parser_Python.RouteContext ctx) {
        int line = ctx.getStart().getLine();
        Parser_Python.Route_parameterContext paramCtx = ctx.route_parameter();
        
        if (paramCtx != null && paramCtx.route_parameter_body() != null) {
            Parser_Python.Route_parameter_bodyContext bodyCtx = paramCtx.route_parameter_body();
            String path = bodyCtx.STRING(0).getText();
            // Remove quotes
            path = path.substring(1, path.length() - 1);
            
            RouteNode routeNode = new RouteNode(path, line);
            
            // Check for methods option
            if (bodyCtx.route_parameter_options() != null) {
                Parser_Python.Route_parameter_optionsContext optionsCtx = bodyCtx.route_parameter_options();
                if (optionsCtx.array() != null) {
                    Parser_Python.ArrayContext arrayCtx = optionsCtx.array();
                    if (arrayCtx.array_items() != null) {
                        for (Parser_Python.StringContext strCtx : arrayCtx.array_items().STRING()) {
                            String method = strCtx.getText();
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
        String functionName = ctx.CHARACTERS(0).getText();
        
        FunctionNode functionNode = new FunctionNode(functionName, line);
        
        // Visit function parameters
        if (ctx.function_parameter() != null && ctx.function_parameter().set_function_parameter() != null) {
            Parser_Python.Set_function_parameterContext paramsCtx = ctx.function_parameter().set_function_parameter();
            for (Parser_Python.TerminalNode param : paramsCtx.CHARACTERS()) {
                functionNode.addParameter(param.getText());
            }
        }
        
        // Visit function body
        if (ctx.function_body() != null) {
            for (Parser_Python.Statement_in_functionContext stmtCtx : ctx.function_body().statement_in_function()) {
                ASTNode result = visit(stmtCtx);
                if (result instanceof StatementNode) {
                    functionNode.addStatement((StatementNode) result);
                }
            }
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
        return visit(ctx.function_call());
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
        String variable = ctx.CHARACTERS(0).getText();
        ExpressionNode value = null;
        
        if (ctx.expression() != null) {
            ASTNode result = visit(ctx.expression());
            if (result instanceof ExpressionNode) {
                value = (ExpressionNode) result;
            }
        }
        
        return new AssignmentNode(line, variable, value);
    }

    @Override
    public ASTNode visitIf_statement(Parser_Python.If_statementContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode condition = null;
        
        if (ctx.condition() != null) {
            ASTNode result = visit(ctx.condition());
            if (result instanceof ExpressionNode) {
                condition = (ExpressionNode) result;
            }
        }
        
        IfNode ifNode = new IfNode(condition, line);
        
        if (ctx.statement_in_function() != null) {
            for (Parser_Python.Statement_in_functionContext stmtCtx : ctx.statement_in_function()) {
                ASTNode result = visit(stmtCtx);
                if (result instanceof StatementNode) {
                    ifNode.addStatement((StatementNode) result);
                }
            }
        }
        
        return ifNode;
    }

    @Override
    public ASTNode visitCondition(Parser_Python.ConditionContext ctx) {
        int line = ctx.getStart().getLine();
        ExpressionNode left = null;
        ExpressionNode right = null;
        String operator = "";
        
        if (ctx.expression(0) != null) {
            ASTNode result = visit(ctx.expression(0));
            if (result instanceof ExpressionNode) {
                left = (ExpressionNode) result;
            }
        }
        
        if (ctx.expression(1) != null) {
            ASTNode result = visit(ctx.expression(1));
            if (result instanceof ExpressionNode) {
                right = (ExpressionNode) result;
            }
        }
        
        if (ctx.comparison_operator() != null) {
            operator = ctx.comparison_operator().getStart().getText();
        }
        
        return new BinaryOpNode(left, operator, right, line);
    }

    @Override
    public ASTNode visitFor_loop(Parser_Python.For_loopContext ctx) {
        int line = ctx.getStart().getLine();
        String variable = ctx.CHARACTERS(0).getText();
        String iterable = ctx.CHARACTERS(1).getText();
        
        ForNode forNode = new ForNode(variable, iterable, line);
        
        if (ctx.statement_in_function() != null) {
            for (Parser_Python.Statement_in_functionContext stmtCtx : ctx.statement_in_function()) {
                ASTNode result = visit(stmtCtx);
                if (result instanceof StatementNode) {
                    forNode.addStatement((StatementNode) result);
                }
            }
        }
        
        return forNode;
    }

    @Override
    public ASTNode visitWith_open(Parser_Python.With_openContext ctx) {
        int line = ctx.getStart().getLine();
        List<String> files = new ArrayList<>();
        String alias = "";
        
        if (ctx.with_parameter() != null) {
            for (Parser_Python.StringContext strCtx : ctx.with_parameter().STRING()) {
                String file = strCtx.getText();
                file = file.substring(1, file.length() - 1);
                files.add(file);
            }
        }
        
        if (ctx.CHARACTERS() != null) {
            alias = ctx.CHARACTERS().getText();
        }
        
        WithNode withNode = new WithNode(files, alias, line);
        
        // Note: With statement body would be handled separately if needed
        // For now, we just create the node
        
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
                } else if (argCtx.key_value() != null) {
                    // Handle key=value arguments
                    Parser_Python.Key_valueContext kvCtx = argCtx.key_value();
                    if (kvCtx.expression() != null) {
                        ASTNode result = visit(kvCtx.expression());
                        if (result instanceof ExpressionNode) {
                            arguments.add((ExpressionNode) result);
                        }
                    }
                } else if (argCtx.curly_argument() != null) {
                    // Handle curly brace arguments
                    Parser_Python.Curly_argumentContext curlyCtx = argCtx.curly_argument();
                    if (curlyCtx.curly_items() != null) {
                        for (Parser_Python.Curly_itemContext itemCtx : curlyCtx.curly_items().curly_item()) {
                            if (itemCtx.other_expression(1) != null) {
                                ASTNode result = visit(itemCtx.other_expression(1));
                                if (result instanceof ExpressionNode) {
                                    arguments.add((ExpressionNode) result);
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return new CallNode(functionName, arguments, line);
    }

    @Override
    public ASTNode visitExpression(Parser_Python.ExpressionContext ctx) {
        if (ctx.other_expression() != null) {
            return visit(ctx.other_expression());
        } else if (ctx.list() != null) {
            return visit(ctx.list());
        }
        return null;
    }

    @Override
    public ASTNode visitOther_expression(Parser_Python.Other_expressionContext ctx) {
        if (ctx.function_call() != null) {
            return visit(ctx.function_call());
        } else if (ctx.index_access() != null) {
            return visit(ctx.index_access());
        } else if (ctx.CHARACTERS() != null) {
            int line = ctx.getStart().getLine();
            return new NameNode(ctx.CHARACTERS().getText(), line);
        } else if (ctx.function_name() != null) {
            int line = ctx.getStart().getLine();
            Parser_Python.Function_nameContext nameCtx = ctx.function_name();
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < nameCtx.CHARACTERS().size(); i++) {
                if (i > 0) {
                    nameBuilder.append(".");
                }
                nameBuilder.append(nameCtx.CHARACTERS(i).getText());
            }
            return new NameNode(nameBuilder.toString(), line);
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
            // Remove quotes
            value = value.substring(1, value.length() - 1);
            return new StringNode(value, line);
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
        // Treat as a function call
        return visit(ctx.function_call());
    }

    @Override
    public ASTNode visitIndex_access(Parser_Python.Index_accessContext ctx) {
        int line = ctx.getStart().getLine();
        String variableName = ctx.CHARACTERS().getText();
        String index = "";
        
        if (ctx.STRING() != null) {
            index = ctx.STRING().getText();
            // Remove quotes
            index = index.substring(1, index.length() - 1);
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
}
