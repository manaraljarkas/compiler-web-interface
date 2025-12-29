package ast.ast_Python.statement;

import ast.ast_Python.expression.ExpressionNode;

public class ReturnNode extends StatementNode {

    private ExpressionNode value;

    public ReturnNode(ExpressionNode value, int line) {
        super("Return", line);
        this.value = value;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ").append(lineNumber).append(")\n");

        sb.append(value.toString(level + 1));
        return sb.toString();
    }
}
