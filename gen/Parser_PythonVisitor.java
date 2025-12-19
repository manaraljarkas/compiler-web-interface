// Generated from C:/MANAR/ITE/4th year/Compilers/compiler-web-interface/grammar/Parser_Python.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser_Python}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Parser_PythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser_Python#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser_Python.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(Parser_Python.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RouteStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteStmt(Parser_Python.RouteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefStmt(Parser_Python.FunctionDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalAssignmentStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAssignmentStmt(Parser_Python.GlobalAssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalIfStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalIfStmt(Parser_Python.GlobalIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(Parser_Python.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#import_flask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_flask(Parser_Python.Import_flaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#import_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_json(Parser_Python.Import_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#function_defination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_defination(Parser_Python.Function_definationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(Parser_Python.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(Parser_Python.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(Parser_Python.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(Parser_Python.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(Parser_Python.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmt(Parser_Python.WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStmt(Parser_Python.FunctionCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(Parser_Python.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter(Parser_Python.Function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#set_function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_function_parameter(Parser_Python.Set_function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute(Parser_Python.RouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#route_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute_parameter(Parser_Python.Route_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#route_parameter_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute_parameter_body(Parser_Python.Route_parameter_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#route_parameter_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute_parameter_options(Parser_Python.Route_parameter_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(Parser_Python.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#array_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_items(Parser_Python.Array_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(Parser_Python.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(Parser_Python.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(Parser_Python.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(Parser_Python.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(Parser_Python.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_value(Parser_Python.Key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#function_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_array(Parser_Python.Function_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#curly_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurly_argument(Parser_Python.Curly_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#curly_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurly_items(Parser_Python.Curly_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#curly_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurly_item(Parser_Python.Curly_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Parser_Python.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#other_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_expression(Parser_Python.Other_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#with_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_open(Parser_Python.With_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#with_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_parameter(Parser_Python.With_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Parser_Python.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Parser_Python.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Parser_Python.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(Parser_Python.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#index_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_access(Parser_Python.Index_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(Parser_Python.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyList}
	 * labeled alternative in {@link Parser_Python#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyList(Parser_Python.EmptyListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonEmptyList}
	 * labeled alternative in {@link Parser_Python#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyList(Parser_Python.NonEmptyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Python#list_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_items(Parser_Python.List_itemsContext ctx);
}