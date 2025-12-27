package ast_Python.statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends StatementNode {

    private String functionName;
    private List<String> parameters;

    public FunctionNode(String functionName, int line) {
        super("FunctionNode", line);
        this.functionName = functionName;
        this.parameters = new ArrayList<>();
    }

    public void addParameter(String param) {
        parameters.add(param);
    }

    public void addBodyStatement(StatementNode stmt) {
        addChild(stmt);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" name=").append(functionName)
                .append(" params=").append(parameters)
                .append(" (line ").append(lineNumber).append(")\n");

        for (var c : children) {
            sb.append(c.toString(level + 1));
        }
        return sb.toString();
    }
}
