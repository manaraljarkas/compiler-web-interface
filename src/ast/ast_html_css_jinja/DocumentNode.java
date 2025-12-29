package ast.ast_html_css_jinja;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class DocumentNode extends ASTNode {

    private List<ASTNode> nodes = new ArrayList<>();

    public DocumentNode(int line) {
        super("Document", line);
    }

    public void addNode(ASTNode node) {
        nodes.add(node);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ").append(lineNumber).append(")\n");

        for (ASTNode n : nodes) {
            sb.append(n.toString(level + 1));
        }
        return sb.toString();
    }
}
