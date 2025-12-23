package ast;

public class NameNode extends ASTNode {

    private String value;

    public NameNode(String value, int lineNumber) {
        super("Name", lineNumber);
        this.value = value;
    }

    @Override
    public String toString(int level) {
        return indent(level)
                + nodeName
                + " (line "
                + lineNumber
                + "): "
                + value
                + "\n";
    }
}
