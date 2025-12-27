package ast_Python.statement;

import ast_Python.expression.ExpressionNode;

public class ReturnNode extends StatementNode {

    public ReturnNode(ExpressionNode value, int line) {
        super("ReturnNode", line);
        addChild(value);
    }

    @Override
    public String toString(int level) {
        return indent(level) + nodeName +
                " (line " + lineNumber + ")\n" +
                children.get(0).toString(level + 1);
    }
}
