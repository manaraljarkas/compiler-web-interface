package ast.ast_html_css_jinja.jinja;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class JinjaIfNode extends ASTNode {

    private String condition;
    private List<ASTNode> body = new ArrayList<>();

    public JinjaIfNode(String condition, int line) {
        super("JinjaIf", line);
        this.condition = condition;
    }

    public void addNode(ASTNode node) {
        body.add(node);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" condition=").append(condition)
                .append(" (line ").append(lineNumber).append(")\n");

        for (ASTNode n : body) {
            sb.append(n.toString(level + 1));
        }
        return sb.toString();
    }
}
