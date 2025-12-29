package ast.ast_Python.statement;

import ast.ast_Python.expression.ExpressionNode;

public class AssignmentNode extends StatementNode {

    private String variable;
    private ExpressionNode value;

    public AssignmentNode(int lineNumber, String variable, ExpressionNode value) {
        super("Assignment", lineNumber);
        this.variable = variable;
        this.value = value;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(lineNumber)
                .append(")\n");

        sb.append(indent(level + 1))
                .append("Var: ")
                .append(variable)
                .append("\n");

        sb.append(value.toString(level + 1));

        return sb.toString();
    }
}

