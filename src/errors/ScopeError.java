package errors;

public class ScopeError extends RuntimeException {
    private final String symbolName;
    private final int lineNumber;
    private final String scopePath;

    public ScopeError(String symbolName, int lineNumber, String scopePath) {
        super("Error: Variable '" + symbolName + "' is not accessible from scope '" + scopePath + "' at line " + lineNumber);
        this.symbolName = symbolName;
        this.lineNumber = lineNumber;
        this.scopePath = scopePath;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getScopePath() {
        return scopePath;
    }
}

