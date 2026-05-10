package SymbolTable;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import errors.ScopeError;
import errors.UndefinedSymbolError;

public class SymbolTable {
    protected Map<String, Row> rows = new LinkedHashMap<>();
    private static final Set<String> historyOfDefinedSymbols = new LinkedHashSet<>();
    private final List<SymbolTable> children = new ArrayList<>();
    private final SymbolTable parent;
    private final String scopeName;

    public SymbolTable() {
        this(null, "global");
    }

    public SymbolTable(SymbolTable parent) {
        this(parent, parent == null ? "global" : "scope");
    }

    public SymbolTable(SymbolTable parent, String scopeName) {
        this.parent = parent;
        this.scopeName = (scopeName == null || scopeName.trim().isEmpty())
                ? (parent == null ? "global" : "scope")
                : scopeName;
        if (parent != null) {
            parent.children.add(this);
        }
    }

    public SymbolTable enterScope() {
        return enterScope(null);
    }

    public SymbolTable enterScope(String scope) {
        return new SymbolTable(this, scope);
    }

    public SymbolTable exitScope() {
        return parent == null ? this : parent;
    }

    public SymbolTable getParent() {
        return parent;
    }

    public String getScopeName() {
        return scopeName;
    }

    public String getCurrentScope() {
        return getScopePath();
    }

    public String getScopePath() {
        if (parent == null) {
            return scopeName;
        }
        return parent.getScopePath() + "/" + scopeName;
    }

    public void define(String key, Row row) {
        String symbolName = normalizeKey(key, row);
        if (rows.containsKey(symbolName)) {
            throw new RuntimeException("Redeclaration Error: " + symbolName);
        }
        if (row.getName() == null) {
            row.setName(symbolName);
        }
        row.setScope(getScopePath());
        this.rows.put(symbolName, row);
        historyOfDefinedSymbols.add(symbolName);
    }

    public void define(Row row) {
        if (row != null) {
            define(row.getName(), row);
        }
    }

    public void addRow(String key, Row row) {
        String symbolName = normalizeKey(key, row);
        if (row.getName() == null) {
            row.setName(symbolName);
        }
        row.setScope(getScopePath());
        this.rows.put(symbolName, row);
        historyOfDefinedSymbols.add(symbolName);
    }

    public Row getRow(String key) {
        return lookup(key);
    }

    public Row getRowInCurrentScope(String key) {
        return this.rows.get(key);
    }

    public boolean containsInCurrentScope(String key) {
        return this.rows.containsKey(key);
    }

    public Row lookup(String name) {
        return lookupInScopeChain(name);
    }

    public Row resolve(String name) {
        return lookupInScopeChain(name);
    }

    public Row resolve(String name, int lineNumber) {
        Row row = lookupInScopeChain(name);
        if (row != null) {
            return row;
        }

        if (name != null && historyOfDefinedSymbols.contains(name)) {
            throw new ScopeError(name, lineNumber, getScopePath());
        }

        throw new UndefinedSymbolError(name, lineNumber);
    }

    public boolean wasEverDefined(String name) {
        return name != null && historyOfDefinedSymbols.contains(name);
    }

    public boolean containsInTree(String name) {
        if (name == null) {
            return false;
        }

        if (rows.containsKey(name)) {
            return true;
        }

        for (SymbolTable child : children) {
            if (child.containsInTree(name)) {
                return true;
            }
        }

        return false;
    }

    public Map<String, Row> getAllRows() {
        Map<String, Row> allRows = new LinkedHashMap<>();
        collectRows(allRows);
        return allRows;
    }

    public void removeRow(String key) {
        this.rows.remove(key);
    }

    public void print() {
        // New pretty table printer that preserves duplicates across scopes
        printTable();
    }

    private void printTable() {
        // collect rows into a list preserving duplicates (same name in different scopes)
        List<RowData> rowsForPrint = new ArrayList<>();
        collectRowsForPrinting(rowsForPrint, 0);

        // headers
        final String h1 = "Symbol Name";
        final String h2 = "Category/Type";
        final String h3 = "Scope Path";
        final String h4 = "Initial Value/Reference";

        // compute column widths
        int nameWidth = h1.length();
        int typeWidth = h2.length();
        int scopeWidth = h3.length();
        int valueWidth = h4.length();

        for (RowData rd : rowsForPrint) {
            int displayNameLen = rd.name.length() + rd.depth * 2; // indentation counted
            nameWidth = Math.max(nameWidth, displayNameLen);
            typeWidth = Math.max(typeWidth, rd.type.length());
            scopeWidth = Math.max(scopeWidth, rd.scope.length());
            valueWidth = Math.max(valueWidth, rd.value.length());
        }

        // Minimum reasonable widths
        nameWidth = Math.max(nameWidth, 12);
        typeWidth = Math.max(typeWidth, 12);
        scopeWidth = Math.max(scopeWidth, 12);
        valueWidth = Math.max(valueWidth, 12);

        // print border + header
        printTableBorder(nameWidth, typeWidth, scopeWidth, valueWidth);
        System.out.printf("| %-" + nameWidth + "s | %-" + typeWidth + "s | %-" + scopeWidth + "s | %-" + valueWidth + "s |\n",
                h1, h2, h3, h4);
        printTableBorder(nameWidth, typeWidth, scopeWidth, valueWidth);

        // print rows
        for (RowData rd : rowsForPrint) {
            String indentedName = makeIndent(rd.depth) + rd.name;
            System.out.printf("| %-" + nameWidth + "s | %-" + typeWidth + "s | %-" + scopeWidth + "s | %-" + valueWidth + "s |\n",
                    indentedName, rd.type, rd.scope, rd.value);
        }

        // footer border
        printTableBorder(nameWidth, typeWidth, scopeWidth, valueWidth);
    }

    private void collectRowsForPrinting(List<RowData> out, int depth) {
        // collect local rows first
        for (Map.Entry<String, Row> entry : this.rows.entrySet()) {
            Row r = entry.getValue();
            if (r != null) {
                String val = r.getValue() == null ? "NULL" : r.getValue();
                out.add(new RowData(r.getName(), r.getType(), r.getScope(), val, depth));
            }
        }

        // then traverse children
        for (SymbolTable child : children) {
            child.collectRowsForPrinting(out, depth + 1);
        }
    }

    private void printTableBorder(int n1, int n2, int n3, int n4) {
        System.out.print("+");
        for (int i = 0; i < n1 + 2; i++) System.out.print("-");
        System.out.print("+");
        for (int i = 0; i < n2 + 2; i++) System.out.print("-");
        System.out.print("+");
        for (int i = 0; i < n3 + 2; i++) System.out.print("-");
        System.out.print("+");
        for (int i = 0; i < n4 + 2; i++) System.out.print("-");
        System.out.println("+");
    }

    private static class RowData {
        String name; String type; String scope; String value; int depth;
        RowData(String name, String type, String scope, String value, int depth) {
            this.name = name; this.type = type; this.scope = scope; this.value = value; this.depth = depth;
        }
    }

    private void collectRows(Map<String, Row> allRows) {
        for (Map.Entry<String, Row> entry : rows.entrySet()) {
            allRows.put(getScopePath() + "::" + entry.getKey(), entry.getValue());
        }

        for (SymbolTable child : children) {
            child.collectRows(allRows);
        }
    }

    private String makeIndent(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

    private String normalizeKey(String key, Row row) {
        if (row != null && row.getName() != null && !row.getName().trim().isEmpty()) {
            return row.getName();
        }
        if (key != null && !key.trim().isEmpty()) {
            return key;
        }
        return "<anonymous>";
    }

    private Row lookupInScopeChain(String name) {
        if (name == null) {
            return null;
        }

        Row localRow = this.rows.get(name);
        if (localRow != null) {
            return localRow;
        }

        if (parent != null) {
            return parent.lookupInScopeChain(name);
        }

        return null;
    }
}