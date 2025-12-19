// Generated from C:/Users/user/compiler-web-interface/grammar/Parser_Css.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser_Css}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Parser_CssVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser_Css#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser_Css.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssStmt}
	 * labeled alternative in {@link Parser_Css#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStmt(Parser_Css.CssStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Css#css_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_definition(Parser_Css.Css_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Css#style_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle_body(Parser_Css.Style_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Css#css_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_header(Parser_Css.Css_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Css#colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon(Parser_Css.ColonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Css#style_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle_content(Parser_Css.Style_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Css#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(Parser_Css.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Css#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Parser_Css.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_Css#value_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_items(Parser_Css.Value_itemsContext ctx);
}