package ast.ast_html_css_jinja.css;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class StyleNode extends ASTNode {

    private List<CssRuleNode> rules = new ArrayList<>();

    public StyleNode(int line) {
        super("Style", line);
    }

    public void addRule(CssRuleNode rule) {
        rules.add(rule);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ").append(lineNumber).append(")\n");

        for (CssRuleNode r : rules) {
            sb.append(r.toString(level + 1));
        }
        return sb.toString();
    }
}
