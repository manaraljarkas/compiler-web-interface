package ast.ast_Python.statement;

import java.util.ArrayList;
import java.util.List;

public class WithNode extends StatementNode {

    private List<String> files;
    private String alias;
    private List<StatementNode> body = new ArrayList<>();

    public WithNode(List<String> files, String alias, int line) {
        super("With", line);
        this.files = files;
        this.alias = alias;
    }

    public void addStatement(StatementNode stmt) {
        body.add(stmt);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" files=").append(files)
                .append(" as ").append(alias)
                .append(" (line ").append(lineNumber).append(")\n");

        for (StatementNode s : body) {
            sb.append(s.toString(level + 1));
        }
        return sb.toString();
    }
}
