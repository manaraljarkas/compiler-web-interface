package errors;

public class TypeError extends RuntimeException {

    public enum ErrorType {
        NOT_CALLABLE, // Calling something that is not a function
        NOT_ITERABLE, // Using a non-iterable in a for loop
        WRONG_ARG_COUNT, // Wrong number of arguments passed to a function
        FUNCTION_AS_VARIABLE, // Using a function name as a variable (e.g. x = len)
        INVALID_ASSIGNMENT, // Assigning a value of the wrong type to a variable (e.g. x = "hello" when x is
                            // expected to be an int)
        WRONG_RETURN_TYPE // Returning a value of the wrong type from a function
    }

    private final ErrorType errorType;
    private final int lineNumber;

    // Not-callable: e.g. calling a string or number as a function
    public TypeError(String name, String actualType, int lineNumber) {
        super("Type Error: '" + name + "' is of type '" + actualType
                + "' and is not callable at line " + lineNumber);
        this.errorType = ErrorType.NOT_CALLABLE;
        this.lineNumber = lineNumber;
    }

    // Not-iterable: e.g. iterating over an int in a for loop
    public TypeError(String variableName, String actualType, boolean isIterable, int lineNumber) {
        super("Type Error: '" + variableName + "' is of type '" + actualType
                + "' and is not iterable at line " + lineNumber);
        this.errorType = ErrorType.NOT_ITERABLE;
        this.lineNumber = lineNumber;
    }

    // Wrong argument count: e.g. calling func(a, b) but it expects 1 param
    public TypeError(String functionName, int expected, int actual, int lineNumber) {
        super("Type Error: '" + functionName + "()' takes " + expected
                + " argument(s) but " + actual + " were given at line " + lineNumber);
        this.errorType = ErrorType.WRONG_ARG_COUNT;
        this.lineNumber = lineNumber;
    }

    // TypeError: Function Used as Variable: e.g. x = len (where len is a function)
    public TypeError(String name, boolean isFunction, int lineNumber) {
        super("Type Error: '" + name + "' is a function and cannot be used as a variable at line " + lineNumber);
        this.errorType = ErrorType.FUNCTION_AS_VARIABLE;
        this.lineNumber = lineNumber;
    }

    // Invalid Assignment: e.g. x = 5 then x = "hello"
    public TypeError(String name, String expectedType, String actualType, boolean isAssignment, int lineNumber) {
        super("Type Error: Cannot assign type '" + actualType + "' to variable '" + name
                + "' which is of type '" + expectedType + "' at line " + lineNumber);
        this.errorType = ErrorType.INVALID_ASSIGNMENT;
        this.lineNumber = lineNumber;
    }

    // Wrong Return Type
    public TypeError(String functionName, String expectedType, String actualType, int lineNumber) {
        super("Type Error: Function '" + functionName + "' returns type '" + actualType
                + "' but expected '" + expectedType + "' at line " + lineNumber);
        this.errorType = ErrorType.WRONG_RETURN_TYPE;
        this.lineNumber = lineNumber;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}