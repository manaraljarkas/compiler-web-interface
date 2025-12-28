package ast_html_css_jinja.html;



import ast_html_css_jinja.ASTNode;

public class DoctypeNode extends ASTNode {

    public DoctypeNode(int line) {
        super(line);
    }

    @Override
    protected String nodeName() {
        return "Doctype";
    }
}
