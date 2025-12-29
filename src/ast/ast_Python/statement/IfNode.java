package ast.ast_Python.statement;

import ast.ast_Python.expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends StatementNode {

    private ExpressionNode condition;
    private List<StatementNode> body = new ArrayList<>();

    public IfNode(ExpressionNode condition, int line) {
        super("If", line);
        this.condition = condition;
    }

    public void addStatement(StatementNode stmt) {
        body.add(stmt);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ").append(lineNumber).append(")\n");

        sb.append(condition.toString(level + 1));

        for (StatementNode s : body) {
            sb.append(s.toString(level + 1));
        }
        return sb.toString();
    }
}
