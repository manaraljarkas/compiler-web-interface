package ast_Python.statement;

import ast_Python.ASTNode;

public abstract class StatementNode extends ASTNode {

    public StatementNode(String name, int line) {
        super(name, line);
    }
}
