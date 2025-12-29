package ast.ast_html_css_jinja.html;

import ast.ASTNode;

public class DoctypeNode extends ASTNode {

    public DoctypeNode(int line) {
        super("Doctype", line);
    }

    @Override
    public String toString(int level) {
        return indent(level) +
                nodeName +
                " (line " + lineNumber + ")\n";
    }
}
