package ast_Python.statement;

public class BreakNode extends StatementNode {

    public BreakNode(int line) {
        super("BreakNode", line);
    }

    @Override
    public String toString(int level) {
        return indent(level) + nodeName +
                " (line " + lineNumber + ")\n";
    }
}
