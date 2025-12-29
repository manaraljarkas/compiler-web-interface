package ast.ast_Python;

import ast.ast_Python.statement.StatementNode;
import java.util.ArrayList;
import java.util.List;
import ast.ASTNode;

public class ProgramNode extends ASTNode {

    private List<StatementNode> statements = new ArrayList<>();

    public ProgramNode(int lineNumber) {
        super("Program", lineNumber);
    }

    public void addStatement(StatementNode stmt) {
        statements.add(stmt);
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(lineNumber)
                .append(")\n");

        for (StatementNode stmt : statements) {
            sb.append(stmt.toString(level + 1));
        }

        return sb.toString();
    }
}