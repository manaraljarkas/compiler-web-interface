package ast_Python.expression;

import java.util.List;

public class CallNode extends ExpressionNode {

    private String functionName;

    public CallNode(String functionName,
                    List<ExpressionNode> arguments,
                    int line) {
        super("CallNode", line);
        this.functionName = functionName;
        arguments.forEach(this::addChild);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" func=").append(functionName)
                .append(" (line ").append(lineNumber).append(")\n");

        for (var c : children) {
            sb.append(c.toString(level + 1));
        }
        return sb.toString();
    }
}
