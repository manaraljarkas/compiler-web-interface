package ast.ast_html_css_jinja.html;

import ast.ASTNode;

public class VoidElementNode extends ASTNode {

    private String tagName;

    public VoidElementNode(String tagName, int line) {
        super("VoidElement", line);
        this.tagName = tagName;
    }

    @Override
    public String toString(int level) {
        return indent(level) +
                nodeName +
                " <" + tagName + " />" +
                " (line " + lineNumber + ")\n";
    }
}
