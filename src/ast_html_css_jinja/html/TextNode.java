package ast_html_css_jinja.html;


import ast_html_css_jinja.ASTNode;

public class TextNode extends ASTNode {

    private String text;

    public TextNode(int line, String text) {
        super(line);
        this.text = text;
    }

    @Override
    protected String nodeName() {
        return "Text: \"" + text.trim() + "\"";
    }
}

