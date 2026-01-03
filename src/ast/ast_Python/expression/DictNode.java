package ast.ast_Python.expression;

import java.util.HashMap;
import java.util.Map;

public class DictNode extends ExpressionNode {

    private Map<String, ExpressionNode> items;

    public DictNode(int line) {
        super("Dict", line);
        this.items = new HashMap<>();
    }

    public void addItem(String key, ExpressionNode value) {
        items.put(key, value);
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ").append(lineNumber).append(")\n");

        for (Map.Entry<String, ExpressionNode> entry : items.entrySet()) {
            sb.append(indent(level + 1))
                    .append("Key: ").append(entry.getKey()).append("\n");
            if (entry.getValue() != null) {
                sb.append(entry.getValue().toString(level + 1));
            } else {
                sb.append(indent(level + 1)).append("Value: <null>\n");
            }
        }

        return sb.toString();
    }
}

