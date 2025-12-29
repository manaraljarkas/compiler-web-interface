package ast;

public abstract class ASTNode {

    protected String nodeName;
    protected int lineNumber;


    public ASTNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
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
