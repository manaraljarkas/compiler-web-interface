package ast.ast_html_css_jinja.jinja;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class JinjaForNode extends ASTNode {

    private String variable;
    private String iterable;
    private List<ASTNode> body = new ArrayList<>();

    public JinjaForNode(String variable, String iterable, int line) {
        super("JinjaFor", line);
        this.variable = variable;
        this.iterable = iterable;
    }

    public void addNode(ASTNode node) {
        body.add(node);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" ").append(variable)
                .append(" in ").append(iterable)
                .append(" (line ").append(lineNumber).append(")\n");

        for (ASTNode n : body) {
            sb.append(n.toString(level + 1));
        }
        return sb.toString();
    }
}
