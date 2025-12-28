package ast_html_css_jinja;


import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {

    protected int line;
    protected List<ASTNode> children = new ArrayList<>();

    public ASTNode(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    public void addChild(ASTNode child) {
        if (child != null) {
            children.add(child);
        }
    }

    protected String indent(int level) {
        return "  ".repeat(level);
    }

    protected abstract String nodeName();

    protected String print(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName()).append("\n");
        for (ASTNode child : children) {
            sb.append(child.print(level + 1));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return print(0);
    }
}

