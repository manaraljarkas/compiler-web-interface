// Generated from C:/Users/user/compiler-web-interface/grammar/Parser_Css.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser_Css}.
 */
public interface Parser_CssListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser_Css#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser_Css.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Css#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser_Css.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssStmt}
	 * labeled alternative in {@link Parser_Css#statement}.
	 * @param ctx the parse tree
	 */
	void enterCssStmt(Parser_Css.CssStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssStmt}
	 * labeled alternative in {@link Parser_Css#statement}.
	 * @param ctx the parse tree
	 */
	void exitCssStmt(Parser_Css.CssStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Css#css_definition}.
	 * @param ctx the parse tree
	 */
	void enterCss_definition(Parser_Css.Css_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Css#css_definition}.
	 * @param ctx the parse tree
	 */
	void exitCss_definition(Parser_Css.Css_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Css#style_body}.
	 * @param ctx the parse tree
	 */
	void enterStyle_body(Parser_Css.Style_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Css#style_body}.
	 * @param ctx the parse tree
	 */
	void exitStyle_body(Parser_Css.Style_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Css#css_header}.
	 * @param ctx the parse tree
	 */
	void enterCss_header(Parser_Css.Css_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Css#css_header}.
	 * @param ctx the parse tree
	 */
	void exitCss_header(Parser_Css.Css_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Css#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(Parser_Css.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Css#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(Parser_Css.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Css#style_content}.
	 * @param ctx the parse tree
	 */
	void enterStyle_content(Parser_Css.Style_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Css#style_content}.
	 * @param ctx the parse tree
	 */
	void exitStyle_content(Parser_Css.Style_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Css#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(Parser_Css.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Css#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(Parser_Css.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Css#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Parser_Css.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Css#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Parser_Css.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_Css#value_items}.
	 * @param ctx the parse tree
	 */
	void enterValue_items(Parser_Css.Value_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_Css#value_items}.
	 * @param ctx the parse tree
	 */
	void exitValue_items(Parser_Css.Value_itemsContext ctx);
}