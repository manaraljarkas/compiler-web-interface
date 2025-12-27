package ast_Python.statement;
import ast_Python.ASTNode;
public class ForNode extends StatementNode {

    private String loopVariable;
    private String iterable;

    public ForNode(String loopVariable, String iterable, int lineNumber) {
        super("For", lineNumber);
        this.loopVariable = loopVariable;
        this.iterable = iterable;
    }

    public String getLoopVariable() {
        return loopVariable;
    }

    public String getIterable() {
        return iterable;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(lineNumber)
                .append("): for ")
                .append(loopVariable)
                .append(" in ")
                .append(iterable)
                .append("\n");

        for (ASTNode child : children) {
            sb.append(child.toString(level + 1));
        }
        return sb.toString();
    }
}


