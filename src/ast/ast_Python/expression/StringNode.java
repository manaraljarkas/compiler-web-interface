package ast.ast_Python.expression;

public class StringNode extends ExpressionNode {

    private String value;

    public StringNode(String value, int line) {
        super("StringNode", line);
        this.value = value;
        this.setType("string");
    }

    @Override
    public String toString(int level) {
        return indent(level) + nodeName +
                " value=\"" + value + "\"" +
                " (line " + lineNumber + ")\n";
    }
}
