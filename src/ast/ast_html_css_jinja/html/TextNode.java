package ast.ast_html_css_jinja.html;

import ast.ASTNode;

public class TextNode extends ASTNode {

    private String text;

    public TextNode(String text, int line) {
        super("Text", line);
        this.text = text;
    }

    @Override
    public String toString(int level) {
        return indent(level) +
                nodeName +
                " \"" + text + "\"" +
                " (line " + lineNumber + ")\n";
    }
}
