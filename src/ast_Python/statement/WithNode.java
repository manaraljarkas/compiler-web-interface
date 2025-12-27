package ast_Python.statement;

import java.util.List;

public class WithNode extends StatementNode {

    private String variableName;
    private List<String> filePaths;

    public WithNode(String variableName, List<String> filePaths, int line) {
        super("WithNode", line);
        this.variableName = variableName;
        this.filePaths = filePaths;
    }

    public String getVariableName() {
        return variableName;
    }

    public List<String> getFilePaths() {
        return filePaths;
    }

    public void addBodyStatement(StatementNode stmt) {
        addChild(stmt);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" var=").append(variableName)
                .append(" files=").append(filePaths)
                .append(" (line ").append(lineNumber).append(")\n");

        for (var c : children) {
            sb.append(c.toString(level + 1));
        }
        return sb.toString();
    }
}
