package errors;

public class UndefinedSymbolError extends RuntimeException {
    private final String symbolName;
    private final int lineNumber;

    public UndefinedSymbolError(String symbolName, int lineNumber) {
        super("Error: Variable '" + symbolName + "' is undefined at line " + lineNumber);
        this.symbolName = symbolName;
        this.lineNumber = lineNumber;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}

