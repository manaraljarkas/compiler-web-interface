package ast.ast_Python.statement;

import ast.ast_Python.expression.CallNode;

public class FunctionCallStatementNode extends StatementNode {

    private CallNode functionCall;

    public FunctionCallStatementNode(CallNode functionCall) {
        super("FunctionCallStatement", functionCall != null ? functionCall.getLineNumber() : 0);
        this.functionCall = functionCall;
    }

    @Override
    public String toString(int level) {
        if (functionCall != null) {
            return functionCall.toString(level);
        }
        return indent(level) + "FunctionCallStatement (line " + lineNumber + ")\n";
    }
}

