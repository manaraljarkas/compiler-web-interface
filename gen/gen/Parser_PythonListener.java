// Generated from grammar/Parser_Python.g4 by ANTLR 4.13.2
package gen;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser_Python}.
 */
public interface Parser_PythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser_Python#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser_Python.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser_Python.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(Parser_Python.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(Parser_Python.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RouteStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void enterRouteStmt(Parser_Python.RouteStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RouteStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void exitRouteStmt(Parser_Python.RouteStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefStmt(Parser_Python.FunctionDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefStmt(Parser_Python.FunctionDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalAssignmentStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAssignmentStmt(Parser_Python.GlobalAssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalAssignmentStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAssignmentStmt(Parser_Python.GlobalAssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalIfStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalIfStmt(Parser_Python.GlobalIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalIfStmt}
	 * labeled alternative in {@link Parser_Python#statement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalIfStmt(Parser_Python.GlobalIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(Parser_Python.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(Parser_Python.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#import_flask}.
	 * @param ctx the parse tree
	 */
	void enterImport_flask(Parser_Python.Import_flaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#import_flask}.
	 * @param ctx the parse tree
	 */
	void exitImport_flask(Parser_Python.Import_flaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#import_json}.
	 * @param ctx the parse tree
	 */
	void enterImport_json(Parser_Python.Import_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#import_json}.
	 * @param ctx the parse tree
	 */
	void exitImport_json(Parser_Python.Import_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#function_defination}.
	 * @param ctx the parse tree
	 */
	void enterFunction_defination(Parser_Python.Function_definationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#function_defination}.
	 * @param ctx the parse tree
	 */
	void exitFunction_defination(Parser_Python.Function_definationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(Parser_Python.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(Parser_Python.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(Parser_Python.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(Parser_Python.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStmt(Parser_Python.FunctionCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStmt(Parser_Python.FunctionCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(Parser_Python.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(Parser_Python.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(Parser_Python.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(Parser_Python.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(Parser_Python.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(Parser_Python.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(Parser_Python.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(Parser_Python.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(Parser_Python.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link Parser_Python#statement_in_function}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(Parser_Python.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(Parser_Python.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(Parser_Python.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#set_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterSet_function_parameter(Parser_Python.Set_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#set_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitSet_function_parameter(Parser_Python.Set_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#route}.
	 * @param ctx the parse tree
	 */
	void enterRoute(Parser_Python.RouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#route}.
	 * @param ctx the parse tree
	 */
	void exitRoute(Parser_Python.RouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#route_parameter}.
	 * @param ctx the parse tree
	 */
	void enterRoute_parameter(Parser_Python.Route_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#route_parameter}.
	 * @param ctx the parse tree
	 */
	void exitRoute_parameter(Parser_Python.Route_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#route_parameter_body}.
	 * @param ctx the parse tree
	 */
	void enterRoute_parameter_body(Parser_Python.Route_parameter_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#route_parameter_body}.
	 * @param ctx the parse tree
	 */
	void exitRoute_parameter_body(Parser_Python.Route_parameter_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#route_parameter_options}.
	 * @param ctx the parse tree
	 */
	void enterRoute_parameter_options(Parser_Python.Route_parameter_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#route_parameter_options}.
	 * @param ctx the parse tree
	 */
	void exitRoute_parameter_options(Parser_Python.Route_parameter_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(Parser_Python.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(Parser_Python.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#array_items}.
	 * @param ctx the parse tree
	 */
	void enterArray_items(Parser_Python.Array_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#array_items}.
	 * @param ctx the parse tree
	 */
	void exitArray_items(Parser_Python.Array_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(Parser_Python.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(Parser_Python.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(Parser_Python.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(Parser_Python.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(Parser_Python.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(Parser_Python.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(Parser_Python.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(Parser_Python.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(Parser_Python.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(Parser_Python.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#key_value}.
	 * @param ctx the parse tree
	 */
	void enterKey_value(Parser_Python.Key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#key_value}.
	 * @param ctx the parse tree
	 */
	void exitKey_value(Parser_Python.Key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#function_array}.
	 * @param ctx the parse tree
	 */
	void enterFunction_array(Parser_Python.Function_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#function_array}.
	 * @param ctx the parse tree
	 */
	void exitFunction_array(Parser_Python.Function_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#curly_argument}.
	 * @param ctx the parse tree
	 */
	void enterCurly_argument(Parser_Python.Curly_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#curly_argument}.
	 * @param ctx the parse tree
	 */
	void exitCurly_argument(Parser_Python.Curly_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#curly_items}.
	 * @param ctx the parse tree
	 */
	void enterCurly_items(Parser_Python.Curly_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#curly_items}.
	 * @param ctx the parse tree
	 */
	void exitCurly_items(Parser_Python.Curly_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#curly_item}.
	 * @param ctx the parse tree
	 */
	void enterCurly_item(Parser_Python.Curly_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#curly_item}.
	 * @param ctx the parse tree
	 */
	void exitCurly_item(Parser_Python.Curly_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Parser_Python.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Parser_Python.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#other_expression}.
	 * @param ctx the parse tree
	 */
	void enterOther_expression(Parser_Python.Other_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#other_expression}.
	 * @param ctx the parse tree
	 */
	void exitOther_expression(Parser_Python.Other_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#with_open}.
	 * @param ctx the parse tree
	 */
	void enterWith_open(Parser_Python.With_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#with_open}.
	 * @param ctx the parse tree
	 */
	void exitWith_open(Parser_Python.With_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#with_parameter}.
	 * @param ctx the parse tree
	 */
	void enterWith_parameter(Parser_Python.With_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#with_parameter}.
	 * @param ctx the parse tree
	 */
	void exitWith_parameter(Parser_Python.With_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Parser_Python.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Parser_Python.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Parser_Python.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Parser_Python.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Parser_Python.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Parser_Python.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(Parser_Python.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(Parser_Python.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#index_access}.
	 * @param ctx the parse tree
	 */
	void enterIndex_access(Parser_Python.Index_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#index_access}.
	 * @param ctx the parse tree
	 */
	void exitIndex_access(Parser_Python.Index_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(Parser_Python.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(Parser_Python.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyList}
	 * labeled alternative in {@link Parser_Python#list}.
	 * @param ctx the parse tree
	 */
	void enterEmptyList(Parser_Python.EmptyListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyList}
	 * labeled alternative in {@link Parser_Python#list}.
	 * @param ctx the parse tree
	 */
	void exitEmptyList(Parser_Python.EmptyListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonEmptyList}
	 * labeled alternative in {@link Parser_Python#list}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyList(Parser_Python.NonEmptyListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonEmptyList}
	 * labeled alternative in {@link Parser_Python#list}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyList(Parser_Python.NonEmptyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Python#list_items}.
	 * @param ctx the parse tree
	 */
	void enterList_items(Parser_Python.List_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Python#list_items}.
	 * @param ctx the parse tree
	 */
	void exitList_items(Parser_Python.List_itemsContext ctx);
}