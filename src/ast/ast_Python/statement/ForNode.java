package ast.ast_Python.statement;

import java.util.ArrayList;
import java.util.List;

public class ForNode extends StatementNode {

    private String variable;
    private String iterable;
    private List<StatementNode> body = new ArrayList<>();

    public ForNode(String variable, String iterable, int line) {
        super("For", line);
        this.variable = variable;
        this.iterable = iterable;
    }

    public void addStatement(StatementNode stmt) {
        body.add(stmt);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" ").append(variable)
                .append(" in ").append(iterable)
                .append(" (line ").append(lineNumber).append(")\n");

        for (StatementNode s : body) {
            sb.append(s.toString(level + 1));
        }
        return sb.toString();
    }
}
