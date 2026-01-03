package SymbolTable;

public class Row {
    private String name;   // Name of the symbol (e.g., variable name)
    private String type;   // Type of the symbol (e.g., VariableAssign)
    private String value;  // Value of the symbol (e.g., 42, "Hello, World!", etc.)
    private String scope;  // Scope of the symbol (e.g., "global", "function", "block")

    public Row() {
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and setter for value
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Getter and setter for scope
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}