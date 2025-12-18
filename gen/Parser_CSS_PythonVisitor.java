// Generated from C:/Users/user/compiler-web-interface/grammar/Parser_CSS_Python.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser_CSS_Python}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Parser_CSS_PythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser_CSS_Python.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(Parser_CSS_Python.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RouteStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteStmt(Parser_CSS_Python.RouteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefStmt(Parser_CSS_Python.FunctionDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalAssignmentStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAssignmentStmt(Parser_CSS_Python.GlobalAssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalIfStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalIfStmt(Parser_CSS_Python.GlobalIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(Parser_CSS_Python.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#import_flask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_flask(Parser_CSS_Python.Import_flaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#import_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_json(Parser_CSS_Python.Import_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#function_defination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_defination(Parser_CSS_Python.Function_definationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(Parser_CSS_Python.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(Parser_CSS_Python.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(Parser_CSS_Python.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(Parser_CSS_Python.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(Parser_CSS_Python.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmt(Parser_CSS_Python.WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStmt(Parser_CSS_Python.FunctionCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link Parser_CSS_Python#statement_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(Parser_CSS_Python.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter(Parser_CSS_Python.Function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#set_function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_function_parameter(Parser_CSS_Python.Set_function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute(Parser_CSS_Python.RouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#route_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute_parameter(Parser_CSS_Python.Route_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#route_parameter_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute_parameter_body(Parser_CSS_Python.Route_parameter_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#route_parameter_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute_parameter_options(Parser_CSS_Python.Route_parameter_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(Parser_CSS_Python.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#array_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_items(Parser_CSS_Python.Array_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(Parser_CSS_Python.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(Parser_CSS_Python.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(Parser_CSS_Python.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(Parser_CSS_Python.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(Parser_CSS_Python.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_value(Parser_CSS_Python.Key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#function_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_array(Parser_CSS_Python.Function_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#curly_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurly_argument(Parser_CSS_Python.Curly_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#curly_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurly_items(Parser_CSS_Python.Curly_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#curly_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurly_item(Parser_CSS_Python.Curly_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Parser_CSS_Python.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#other_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_expression(Parser_CSS_Python.Other_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#with_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_open(Parser_CSS_Python.With_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#with_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_parameter(Parser_CSS_Python.With_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Parser_CSS_Python.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Parser_CSS_Python.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Parser_CSS_Python.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(Parser_CSS_Python.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#index_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_access(Parser_CSS_Python.Index_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(Parser_CSS_Python.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyList}
	 * labeled alternative in {@link Parser_CSS_Python#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyList(Parser_CSS_Python.EmptyListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonEmptyList}
	 * labeled alternative in {@link Parser_CSS_Python#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyList(Parser_CSS_Python.NonEmptyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_CSS_Python#list_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_items(Parser_CSS_Python.List_itemsContext ctx);
}