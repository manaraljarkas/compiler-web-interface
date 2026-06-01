package errors;

public class FlaskVariableError extends RuntimeException {

    public enum ErrorType {
        VARIABLE_NOT_SENT,
        NO_RENDER_TEMPLATE
    }

    private final String variableName;
    private final String templateFile;
    private final int lineNumber;
    private final ErrorType errorType;

    public FlaskVariableError(String variableName, String templateFile, int lineNumber) {
        super("Flask Error: Variable '" + variableName
                + "' used in '" + templateFile
                + "' at line " + lineNumber
                + " was never passed by render_template()");
        this.variableName = variableName;
        this.templateFile = templateFile;
        this.lineNumber = lineNumber;
        this.errorType = ErrorType.VARIABLE_NOT_SENT;
    }

    public FlaskVariableError(String templateFile, int lineNumber) {
        super("Flask Error: Template '" + templateFile
                + "' uses Jinja variables at line " + lineNumber
                + " but no render_template() was found that renders it");
        this.variableName = null;
        this.templateFile = templateFile;
        this.lineNumber = lineNumber;
        this.errorType = ErrorType.NO_RENDER_TEMPLATE;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getTemplateFile() {
        return templateFile;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}