package ast.ast_Python.statement;

import java.util.List;

public class ImportNode extends StatementNode {

    private String moduleName;
    private List<String> importedNames;

    public ImportNode(String moduleName, List<String> importedNames, int line) {
        super("ImportNode", line);
        this.moduleName = moduleName;
        this.importedNames = importedNames;
    }

    @Override
    public String toString(int level) {
        return indent(level) + nodeName +
                " module=" + moduleName +
                " names=" + importedNames +
                " (line " + lineNumber + ")\n";
    }
}
