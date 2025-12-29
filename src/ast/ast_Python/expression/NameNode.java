package ast.ast_Python.expression;

public class NameNode extends ExpressionNode {

    private String identifier;

    public NameNode(String identifier, int line) {
        super("NameNode", line);
        this.identifier = identifier;
    }

    @Override
    public String toString(int level) {
        return indent(level) + nodeName +
                " id=" + identifier +
                " (line " + lineNumber + ")\n";
    }
}
