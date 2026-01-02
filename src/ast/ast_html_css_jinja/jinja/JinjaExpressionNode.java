package ast.ast_html_css_jinja.jinja;

import ast.ASTNode;

public class JinjaExpressionNode extends ASTNode {

    private String expression;

    public JinjaExpressionNode(String expression, int line) {
        super("JinjaExpression", line);
        this.expression = expression;
    }

    @Override
    public String toString(int level) {
        return indent(level) +
                nodeName +
                " {{ " + expression + " }}" +
                " (line " + lineNumber + ")\n";
    }
}
