package ast.ast_Python.expression;

import errors.TypeMismatch;

public class BinaryOpNode extends ExpressionNode {

    private ExpressionNode left;
    private String operator;
    private ExpressionNode right;

    public BinaryOpNode(ExpressionNode left, String operator, ExpressionNode right, int line) {
        super("BinaryOp", line);
        this.left = left;
        this.operator = operator;
        this.right = right;
        CheckType();
    }

    public void CheckType() {
        String leftType = left.getType();
        String rightType = right.getType();

        if (leftType == null || rightType == null) return;

        if (!leftType.equals(rightType)) {
            throw new TypeMismatch(leftType, rightType, this.lineNumber);
        }
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" op=").append(operator)
                .append(" (line ").append(lineNumber).append(")\n");

        sb.append(left.toString(level + 1));
        sb.append(right.toString(level + 1));

        return sb.toString();
    }
}
