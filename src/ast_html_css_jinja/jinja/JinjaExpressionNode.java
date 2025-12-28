package ast_html_css_jinja.jinja;
import ast_html_css_jinja.ASTNode;

public class JinjaExpressionNode extends ASTNode {

    private String expression;

    public JinjaExpressionNode(int line, String expression) {
        super(line);
        this.expression = expression;
    }

    @Override
    protected String nodeName() {
        return "JinjaExpression {{ " + expression + " }}";
    }
}

