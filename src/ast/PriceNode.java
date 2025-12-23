package ast;

public class PriceNode extends ASTNode {

    private String value;

    public PriceNode(String value, int lineNumber) {
        super("Price", lineNumber);
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
