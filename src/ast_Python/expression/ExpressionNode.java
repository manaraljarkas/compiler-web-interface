package ast_Python.expression;

import ast_Python.ASTNode;

public abstract class ExpressionNode extends ASTNode {

    public ExpressionNode(String name, int line) {
        super(name, line);
    }
}
