package ast_Python.statement;

import ast_Python.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class RouteNode extends StatementNode {

    private String routePath;
    private List<String> methods;

    public RouteNode(String routePath, int lineNumber) {
        super("Route", lineNumber);
        this.routePath = routePath;
        this.methods = new ArrayList<>();
    }

    public void addMethod(String method) {
        methods.add(method);
    }

    public String getRoutePath() {
        return routePath;
    }

    public List<String> getMethods() {
        return methods;
    }

    @Override
    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(lineNumber)
                .append("): ")
                .append(routePath);

        if (!methods.isEmpty()) {
            sb.append(" [methods: ").append(String.join(", ", methods)).append("]");
        }
        sb.append("\n");

        for (ASTNode child : children) {
            sb.append(child.toString(level + 1));
        }
        return sb.toString();
    }
}
