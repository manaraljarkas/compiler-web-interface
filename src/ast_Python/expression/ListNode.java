package ast_Python.expression;

import java.util.List;

public class ListNode extends ExpressionNode {

    public ListNode(List<ExpressionNode> elements, int line) {
        super("ListNode", line);
        elements.forEach(this::addChild);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ").append(lineNumber).append(")\n");

        for (var c : children) {
            sb.append(c.toString(level + 1));
        }
        return sb.toString();
    }
}
