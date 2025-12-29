package ast.ast_Python.expression;

import java.util.List;

public class ListNode extends ExpressionNode {

    private List<ExpressionNode> elements;

    public ListNode(List<ExpressionNode> elements, int line) {
        super("List", line);
        this.elements = elements;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ").append(lineNumber).append(")\n");

        for (ExpressionNode e : elements) {
            sb.append(e.toString(level + 1));
        }
        return sb.toString();
    }
}
