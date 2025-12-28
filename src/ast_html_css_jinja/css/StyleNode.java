package ast_html_css_jinja.css;



import ast_html_css_jinja.ASTNode;

public class StyleNode extends ASTNode {

    public StyleNode(int line) {
        super(line);
    }

    @Override
    protected String nodeName() {
        return "Style";
    }
}

