// Generated from C:/Users/iamgh/compiler-web-interface/grammar/Parser_HTML_Jinja_CSS.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser_HTML_Jinja_CSS}.
 */
public interface Parser_HTML_Jinja_CSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(Parser_HTML_Jinja_CSS.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(Parser_HTML_Jinja_CSS.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoctypeNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeNode(Parser_HTML_Jinja_CSS.DoctypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoctypeNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeNode(Parser_HTML_Jinja_CSS.DoctypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNode(Parser_HTML_Jinja_CSS.HtmlNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNode(Parser_HTML_Jinja_CSS.HtmlNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidElements_img_input_br_hr}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void enterVoidElements_img_input_br_hr(Parser_HTML_Jinja_CSS.VoidElements_img_input_br_hrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidElements_img_input_br_hr}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void exitVoidElements_img_input_br_hr(Parser_HTML_Jinja_CSS.VoidElements_img_input_br_hrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void enterStyleNode(Parser_HTML_Jinja_CSS.StyleNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void exitStyleNode(Parser_HTML_Jinja_CSS.StyleNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaStmtNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStmtNode(Parser_HTML_Jinja_CSS.JinjaStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaStmtNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStmtNode(Parser_HTML_Jinja_CSS.JinjaStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExprNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprNode(Parser_HTML_Jinja_CSS.JinjaExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExprNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprNode(Parser_HTML_Jinja_CSS.JinjaExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void enterTextNode(Parser_HTML_Jinja_CSS.TextNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link Parser_HTML_Jinja_CSS#node}.
	 * @param ctx the parse tree
	 */
	void exitTextNode(Parser_HTML_Jinja_CSS.TextNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(Parser_HTML_Jinja_CSS.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(Parser_HTML_Jinja_CSS.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(Parser_HTML_Jinja_CSS.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(Parser_HTML_Jinja_CSS.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(Parser_HTML_Jinja_CSS.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(Parser_HTML_Jinja_CSS.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#htmlVoidElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlVoidElement(Parser_HTML_Jinja_CSS.HtmlVoidElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#htmlVoidElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlVoidElement(Parser_HTML_Jinja_CSS.HtmlVoidElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatement(Parser_HTML_Jinja_CSS.JinjaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatement(Parser_HTML_Jinja_CSS.JinjaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaForStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForStatement(Parser_HTML_Jinja_CSS.JinjaForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaForStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForStatement(Parser_HTML_Jinja_CSS.JinjaForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfStatement(Parser_HTML_Jinja_CSS.JinjaIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfStatement(Parser_HTML_Jinja_CSS.JinjaIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(Parser_HTML_Jinja_CSS.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(Parser_HTML_Jinja_CSS.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(Parser_HTML_Jinja_CSS.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(Parser_HTML_Jinja_CSS.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_rule}.
	 * @param ctx the parse tree
	 */
	void enterCss_rule(Parser_HTML_Jinja_CSS.Css_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_rule}.
	 * @param ctx the parse tree
	 */
	void exitCss_rule(Parser_HTML_Jinja_CSS.Css_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_selector}.
	 * @param ctx the parse tree
	 */
	void enterCss_selector(Parser_HTML_Jinja_CSS.Css_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_selector}.
	 * @param ctx the parse tree
	 */
	void exitCss_selector(Parser_HTML_Jinja_CSS.Css_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_property}.
	 * @param ctx the parse tree
	 */
	void enterCss_property(Parser_HTML_Jinja_CSS.Css_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_property}.
	 * @param ctx the parse tree
	 */
	void exitCss_property(Parser_HTML_Jinja_CSS.Css_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_value}.
	 * @param ctx the parse tree
	 */
	void enterCss_value(Parser_HTML_Jinja_CSS.Css_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser_HTML_Jinja_CSS#css_value}.
	 * @param ctx the parse tree
	 */
	void exitCss_value(Parser_HTML_Jinja_CSS.Css_valueContext ctx);
}