package ast;

public class AddProductNode extends ASTNode {

    public AddProductNode(int lineNumber) {

        super("AddProduct", lineNumber);
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
