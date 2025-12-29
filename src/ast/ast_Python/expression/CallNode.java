package ast.ast_Python.expression;

import java.util.List;

public class CallNode extends ExpressionNode {

    private String functionName;
    private List<ExpressionNode> arguments;

    public CallNode(String functionName,
                    List<ExpressionNode> arguments,
                    int line) {
        super("Call", line);
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" func=").append(functionName)
                .append(" (line ").append(lineNumber).append(")\n");

        for (ExpressionNode arg : arguments) {
            sb.append(arg.toString(level + 1));
        }
        return sb.toString();
    }
}
