package ast_html_css_jinja.jinja;

import ast_html_css_jinja.ASTNode;

public class JinjaForNode extends ASTNode {

    private String iterator;
    private String iterable;

    public JinjaForNode(int line, String iterator, String iterable) {
        super(line);
        this.iterator = iterator;
        this.iterable = iterable;
    }

    @Override
    protected String nodeName() {
        return "JinjaFor (" + iterator + " in " + iterable + ")";
    }
}
