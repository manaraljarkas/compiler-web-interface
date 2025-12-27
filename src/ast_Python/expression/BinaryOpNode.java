package ast_Python.expression;

public class BinaryOpNode extends ExpressionNode {

    private String operator;

    public BinaryOpNode(ExpressionNode left,
                        String operator,
                        ExpressionNode right,
                        int line) {
        super("BinaryOpNode", line);
        this.operator = operator;
        addChild(left);
        addChild(right);
    }

    @Override
    public String toString(int level) {
        return indent(level) + nodeName +
                " op=" + operator +
                " (line " + lineNumber + ")\n" +
                children.get(0).toString(level + 1) +
                children.get(1).toString(level + 1);
    }
}
