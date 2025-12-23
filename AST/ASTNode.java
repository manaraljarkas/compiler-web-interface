package ast;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {
    protected String nodeName;
    protected int lineNumber;
    protected List<ASTNode> children = new ArrayList<>();

    public ASTNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    public String getNodeName() {
        return nodeName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    // polymorphism (Visitor)
    public abstract void accept(Visitor visitor);
}
