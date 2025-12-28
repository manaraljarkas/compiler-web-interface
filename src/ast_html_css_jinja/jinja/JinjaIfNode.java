package ast_html_css_jinja.jinja;



import ast_html_css_jinja.ASTNode;

public class JinjaIfNode extends ASTNode {

    private String condition;

    public JinjaIfNode(int line, String condition) {
        super(line);
        this.condition = condition;
    }

    @Override
    protected String nodeName() {
        return "JinjaIf (" + condition + ")";
    }
}
