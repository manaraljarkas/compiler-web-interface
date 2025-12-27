package ast.expression;

public class NumberNode extends ExpressionNode {

    private int value;

    public NumberNode(int value, int line) {
        super("NumberNode", line);
        this.value = value;
    }

    @Override
    public String toString(int level) {
        return indent(level) + nodeName +
                " value=" + value +
                " (line " + lineNumber + ")\n";
    }
}
