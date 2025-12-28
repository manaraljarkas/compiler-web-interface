package ast_html_css_jinja.css;
import ast_html_css_jinja.ASTNode;

public class CssPropertyNode extends ASTNode {

    private String name;
    private String value;

    public CssPropertyNode(int line, String name, String value) {
        super(line);
        this.name = name;
        this.value = value;
    }

    @Override
    protected String nodeName() {
        return "CssProperty " + name + ": " + value;
    }
}

