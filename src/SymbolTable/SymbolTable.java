package SymbolTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    protected Map<String, Row> rows = new HashMap<>();
    private Stack<String> scopeStack = new Stack<>();

    public SymbolTable() {
        scopeStack.push("global");
    }

    public void enterScope(String scope) {
        scopeStack.push(scope);
    }

    public void exitScope() {
        if (scopeStack.size() > 1) {
            scopeStack.pop();
        }
    }
    public String getCurrentScope() {
        return scopeStack.peek();
    }

    public void addRow(String key, Row row) {
        if (row.getName() == null) {
            row.setName(key);
        }
        row.setScope(getCurrentScope());
        this.rows.put(key, row);
    }

    public Row getRow(String key) {
        return this.rows.get(key);
    }

    public Map<String, Row> getAllRows() {
        return this.rows;
    }

    public void removeRow(String key) {
        this.rows.remove(key);
    }

    public void print() {
        int nameWidth = 40;
        int typeWidth = 40;
        int scopeWidth = 40;
        int valueWidth = 250;

        printHeader(nameWidth, typeWidth, scopeWidth, valueWidth);

        System.out.printf("║ \u001B[38;5;213m%-" + nameWidth + "s\u001B[0m ║ \u001B[38;5;213m%-" + typeWidth + "s\u001B[0m ║ \u001B[38;5;213m%-" + scopeWidth + "s\u001B[0m ║ \u001B[38;5;213m%-" + valueWidth + "s\u001B[0m ║\n",
                "Name", "Type", "Scope", "Value");

        printLine(nameWidth, typeWidth, scopeWidth, valueWidth);

        for (Map.Entry<String, Row> entry : rows.entrySet()) {
            Row row = entry.getValue();
            if (row != null) {
                System.out.printf("║ \u001B[38;5;183m%-" + nameWidth + "s\u001B[0m ║ \u001B[38;5;141m%-" + typeWidth + "s\u001B[0m ║ \u001B[38;5;117m%-" + scopeWidth + "s\u001B[0m ║ \u001B[38;5;159m%-" + valueWidth + "s\u001B[0m ║\n",
                        row.getName(),
                        row.getType(),
                        row.getScope(),
                        row.getValue() == null ? "null" : row.getValue());
                printLine(nameWidth, typeWidth, scopeWidth, valueWidth);
            }
        }
    }

    private void printHeader(int nameWidth, int typeWidth, int scopeWidth, int valueWidth) {
        System.out.print("╔");
        for (int i = 0; i < nameWidth + 2; i++) System.out.print("═");
        System.out.print("╦");
        for (int i = 0; i < typeWidth + 2; i++) System.out.print("═");
        System.out.print("╦");
        for (int i = 0; i < scopeWidth + 2; i++) System.out.print("═");
        System.out.print("╦");
        for (int i = 0; i < valueWidth + 2; i++) System.out.print("═");
        System.out.println("╗");
    }

    private void printLine(int nameWidth, int typeWidth, int scopeWidth, int valueWidth) {
        System.out.print("╠");
        for (int i = 0; i < nameWidth + 2; i++) System.out.print("─");
        System.out.print("╬");
        for (int i = 0; i < typeWidth + 2; i++) System.out.print("─");
        System.out.print("╬");
        for (int i = 0; i < scopeWidth + 2; i++) System.out.print("─");
        System.out.print("╬");
        for (int i = 0; i < valueWidth + 2; i++) System.out.print("─");
        System.out.println("╣");
    }

    private void printFooter(int nameWidth, int typeWidth, int scopeWidth, int valueWidth) {
        System.out.print("╚");
        for (int i = 0; i < nameWidth + 2; i++) System.out.print("═");
        System.out.print("╩");
        for (int i = 0; i < typeWidth + 2; i++) System.out.print("═");
        System.out.print("╩");
        for (int i = 0; i < scopeWidth + 2; i++) System.out.print("═");
        System.out.print("╩");
        for (int i = 0; i < valueWidth + 2; i++) System.out.print("═");
        System.out.println("╝");
    }
}