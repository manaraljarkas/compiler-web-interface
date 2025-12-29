package ast.ast_html_css_jinja.css;

import ast.ASTNode;

public class CssPropertyNode extends ASTNode {

    private String name;
    private String value;

    public CssPropertyNode(String name, String value, int line) {
        super("CssProperty", line);
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString(int level) {
        return indent(level) +
                nodeName +
                " " + name + ": " + value +
                " (line " + lineNumber + ")\n";
    }
}
