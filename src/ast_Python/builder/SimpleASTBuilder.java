//
//package ast_Python.builder;
//import ast_Python.*;
//import ast_Python.statement.*;
//import ast_Python.expression.*;
//import grammar.Parser_Python;
//
//
//
//public class SimpleASTBuilder extends Parser_PythonBaseVisitor<ASTNode> {
//
//    @Override
//    public ASTNode visitProgram(Parser_Python.ProgramContext ctx) {
//        ProgramNode program = new ProgramNode(ctx.start.getLine());
//
//        for (Parser_Python.StatementContext st : ctx.statement()) {
//            ASTNode child = visit(st);
//            if (child != null) {
//                program.addChild(child);
//            }
//        }
//        return program;
//    }
//
//    @Override
//    public ASTNode visitImportStmt(Parser_Python.ImportStmtContext ctx) {
//        return new ImportNode(ctx.start.getLine());
//    }
//
//    @Override
//    public ASTNode visitFunctionDefStmt(Parser_Python.FunctionDefStmtContext ctx) {
//        FunctionNode fn = new FunctionNode(
//                ctx.CHARACTERS().getText(),
//                ctx.start.getLine()
//        );
//
//        for (Parser_Python.Statement_in_functionContext st
//                : ctx.function_defination()
//                .function_body()
//                .statement_in_function()) {
//
//            ASTNode child = visit(st);
//            if (child != null) {
//                fn.addChild(child);
//            }
//        }
//        return fn;
//    }
//
//    @Override
//    public ASTNode visitAssignmentStmt(Parser_Python.AssignmentStmtContext ctx) {
//        AssignmentNode asg = new AssignmentNode(ctx.start.getLine());
//
//        asg.addChild(new NameNode(
//                ctx.CHARACTERS().getText(),
//                ctx.start.getLine()
//        ));
//
//        return asg;
//    }
//
//    @Override
//    protected ASTNode defaultResult() {
//        return null;
//    }
//}
