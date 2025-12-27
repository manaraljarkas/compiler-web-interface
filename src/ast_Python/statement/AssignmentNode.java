package ast_Python.statement;
import ast_Python.ASTNode;
public class AssignmentNode extends StatementNode {

    private String variableName;
    private String operator; // "=" or "+="

    public AssignmentNode(String variableName, String operator, int lineNumber) {
        super("Assignment", lineNumber);
        this.variableName = variableName;
        this.operator = operator;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(lineNumber)
                .append("): ")
                .append(variableName)
                .append(" ")
                .append(operator)
                .append(" [expression]\n");

        for (ASTNode child : children) {
            sb.append(child.toString(level + 1));
        }
        return sb.toString();
    }
}


