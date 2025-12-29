package ast.ast_html_css_jinja.css;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class CssRuleNode extends ASTNode {

    private String selector;
    private List<CssPropertyNode> properties = new ArrayList<>();

    public CssRuleNode(String selector, int line) {
        super("CssRule", line);
        this.selector = selector;
    }

    public void addProperty(CssPropertyNode prop) {
        properties.add(prop);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" selector=").append(selector)
                .append(" (line ").append(lineNumber).append(")\n");

        for (CssPropertyNode p : properties) {
            sb.append(p.toString(level + 1));
        }
        return sb.toString();
    }
}
