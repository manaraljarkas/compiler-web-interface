// Generated from C:/MANAR/ITE/4th year/Compilers/compiler-web-interface/grammar/Parser_HTML_Jinja_CSS.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser_HTML_Jinja_CSS}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Parser_HTML_Jinja_CSSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(Parser_HTML_Jinja_CSS.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoctypeNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeNode(Parser_HTML_Jinja_CSS.DoctypeNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNode(Parser_HTML_Jinja_CSS.HtmlNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidElements_img_input_br_hr}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidElements_img_input_br_hr(Parser_HTML_Jinja_CSS.VoidElements_img_input_br_hrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleNode(Parser_HTML_Jinja_CSS.StyleNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaStmtNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStmtNode(Parser_HTML_Jinja_CSS.JinjaStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExprNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprNode(Parser_HTML_Jinja_CSS.JinjaExprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNode(Parser_HTML_Jinja_CSS.TextNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(Parser_HTML_Jinja_CSS.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(Parser_HTML_Jinja_CSS.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(Parser_HTML_Jinja_CSS.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#htmlVoidElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlVoidElement(Parser_HTML_Jinja_CSS.HtmlVoidElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatement(Parser_HTML_Jinja_CSS.JinjaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForStatement(Parser_HTML_Jinja_CSS.JinjaForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfStatement(Parser_HTML_Jinja_CSS.JinjaIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(Parser_HTML_Jinja_CSS.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(Parser_HTML_Jinja_CSS.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_rule(Parser_HTML_Jinja_CSS.Css_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_selector(Parser_HTML_Jinja_CSS.Css_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_property(Parser_HTML_Jinja_CSS.Css_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_value(Parser_HTML_Jinja_CSS.Css_valueContext ctx);
}