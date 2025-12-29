package ast.ast_Python.statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionNode extends StatementNode {

    private String name;
    private List<String> parameters = new ArrayList<>();
    private List<StatementNode> body = new ArrayList<>();

    public FunctionNode(String name, int line) {
        super("Function", line);
        this.name = name;
    }

    public void addParameter(String param) {
        parameters.add(param);
    }

    public void addStatement(StatementNode stmt) {
        body.add(stmt);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" name=").append(name)
                .append(" params=").append(parameters)
                .append(" (line ").append(lineNumber).append(")\n");

        for (StatementNode s : body) {
            sb.append(s.toString(level + 1));
        }
        return sb.toString();
    }
}
