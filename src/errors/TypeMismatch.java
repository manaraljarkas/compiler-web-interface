package errors;

public class TypeMismatch extends RuntimeException {

    public TypeMismatch(String expected, String actual, int line) {
        super("Type Mismatch Error: Expected [" + expected + "] but found [" + actual + "] at line " + line);
    }

    public TypeMismatch(String message) {
        super(message);
    }
}