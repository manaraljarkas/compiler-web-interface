package ast.ast_Python.expression;

import ast.ASTNode;

public abstract class ExpressionNode extends ASTNode {

    public ExpressionNode(String name, int line) {
        super(name, line);
    }
}
