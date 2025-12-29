package ast.ast_html_css_jinja.html;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class HtmlElementNode extends ASTNode {

    private String tagName;
    private List<ASTNode> children = new ArrayList<>();

    public HtmlElementNode(String tagName, int line) {
        super("HtmlElement", line);
        this.tagName = tagName;
    }

    public void addChild(ASTNode node) {
        children.add(node);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" <").append(tagName).append(">")
                .append(" (line ").append(lineNumber).append(")\n");

        for (ASTNode c : children) {
            sb.append(c.toString(level + 1));
        }
        return sb.toString();
    }
}
