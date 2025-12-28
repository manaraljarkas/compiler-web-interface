package ast_html_css_jinja.html;



import ast_html_css_jinja.ASTNode;
import java.util.Map;

public class HtmlElementNode extends ASTNode {

    private String tagName;
    private Map<String, String> attributes;

    public HtmlElementNode(int line, String tagName, Map<String, String> attributes) {
        super(line);
        this.tagName = tagName;
        this.attributes = attributes;
    }

    @Override
    protected String nodeName() {
        return "HtmlElement <" + tagName + ">";
    }
}
