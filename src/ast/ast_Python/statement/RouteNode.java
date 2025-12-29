package ast.ast_Python.statement;

import java.util.ArrayList;
import java.util.List;

public class RouteNode extends StatementNode {

    private String path;
    private List<String> methods = new ArrayList<>();

    public RouteNode(String path, int line) {
        super("Route", line);
        this.path = path;
    }

    public void addMethod(String method) {
        methods.add(method);
    }

    @Override
    public String toString(int level) {
        return indent(level) +
                nodeName +
                " path=" + path +
                " methods=" + methods +
                " (line " + lineNumber + ")\n";
    }
}
