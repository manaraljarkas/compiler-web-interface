package ast;

public class ProgramNode extends ASTNode {

    public ProgramNode() {
        super("Program", 0);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(lineNumber)
                .append(")\n");

        for (ASTNode child : children) {
            sb.append(child.toString(level + 1));
        }
        return sb.toString();
    }
}
