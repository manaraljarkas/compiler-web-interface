package ast_Python.expression;

public class iIndexAccessNode extends ExpressionNode {

    private String variableName;
    private String index;

    public iIndexAccessNode(String variableName, String index, int line) {
        super("IndexAccessNode", line);
        this.variableName = variableName;
        this.index = index;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getIndex() {
        return index;
    }

    @Override
    public String toString(int level) {
        return indent(level) + nodeName +
                " var=" + variableName +
                " index=" + index +
                " (line " + lineNumber + ")\n";
    }
}
