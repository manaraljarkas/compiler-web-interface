package ast.ast_Python.expression;

import ast.ASTNode;

public abstract class ExpressionNode extends ASTNode {
    protected String type;
    public ExpressionNode(String name, int line) {
        super(name, line);
    }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
