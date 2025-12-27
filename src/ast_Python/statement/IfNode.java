package ast_Python.statement;

import ast_Python.expression.ExpressionNode;

public class IfNode extends StatementNode {

    public IfNode(ExpressionNode condition, int line) {
        super("IfNode", line);
        addChild(condition);
    }

    public void addIfStatement(StatementNode stmt) {
        addChild(stmt);
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
