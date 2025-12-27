package ast_Python;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {

    protected String nodeName;
    protected int lineNumber;
    protected ASTNode parent;
    protected List<ASTNode> children;

    public ASTNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();
    }

    public void addChild(ASTNode child) {
        if (child != null) {
            children.add(child);
            child.parent = this;
        }
    }

//    public void removeChild(ASTNode child) {
//        children.remove(child);
//    }

    public List<ASTNode> getChildren() {
        return children;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getNodeName() {
        return nodeName;
    }

    protected String indent(int level) {
        return "  ".repeat(level);
    }

    public abstract String toString(int level);
  
    @Override
    public String toString() {
        return toString(0);
    }
}
