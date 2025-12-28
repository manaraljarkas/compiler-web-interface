package ast_html_css_jinja.css;
import ast_html_css_jinja.ASTNode;

public class CssRuleNode extends ASTNode {

    private String selector;

    public CssRuleNode(int line, String selector) {
        super(line);
        this.selector = selector;
    }

    @Override
    protected String nodeName() {
        return "CssRule (" + selector + ")";
    }
}
