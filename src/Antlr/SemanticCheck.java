package Antlr;

import AST.Row;
import AST.SymbolTable;

import java.util.*;

public class SemanticCheck {

    private SymbolTable symbolTable;

    public SemanticCheck() {
    }

    public SymbolTable getsymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public boolean check(SymbolTable fullTable) {
        boolean isValid = true;

        if (checkDuplicateComponentSelector(fullTable)) {
            System.err.println("Semantic error: Duplicate selector found.");
            isValid = false;
        }

        if (isFunctionReturnTypeMismatched(fullTable)) {
            System.err.println("Semantic error: Mismatched datatype in function return.");
            isValid = false;
        }

        if (!isValidTemplateUrl(fullTable)) {
            System.err.println("Semantic error: 'templateUrl' must end with '.html'.");
            isValid = false;
        }

        if (!isValidStyleUrls(fullTable)) {
            System.err.println("Semantic error: 'styles' elements must end with '.css'.");
            isValid = false;
        }

        if (isVariableRedefinedInSameScope(fullTable)) {
            System.err.println("Semantic error: Variable is already defined in this scope.");
            isValid = false;
        }

        return isValid;
    }

    boolean checkDuplicateComponentSelector(SymbolTable fullTable) {
        SymbolTable selectorTable = filterRowsByName(fullTable, "selector");
        Set<String> seenSelectors = new HashSet<>();

        for (Row row : selectorTable.getRows()) {
            String selector = row.getValue();
            if (seenSelectors.contains(selector)) {
                return true;
            }
            seenSelectors.add(selector);
        }
        return false;
    }

    public boolean isFunctionReturnTypeMismatched(SymbolTable fullTable) {
        SymbolTable functionTable = filterRowsByType(fullTable, "function");

        for (Row row : functionTable.getRows()) {
            String value = row.getValue();
            if (value == null || value.trim().isEmpty()) continue;
            if (!value.contains(":")) continue;

            String[] parts = value.split(":");
            String declared = parts[0].trim();
            String actual = parts[1].trim();

            if (!declared.equals(actual)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidTemplateUrl(SymbolTable fullTable) {
        SymbolTable templateTable = filterRowsByName(fullTable, "templateUrl");

        for (Row row : templateTable.getRows()) {
            String value = row.getValue();
            if (value == null || !value.endsWith(".html")) {
                return false;
            }
        }

        return true;
    }

    public boolean isValidStyleUrls(SymbolTable fullTable) {
        SymbolTable styleTable = new SymbolTable();

        for (Row row : fullTable.getRows()) {
            String name = row.getName();
            if (name != null && (name.equalsIgnoreCase("styleUrls"))) {
                styleTable.AddRow(row);
            }
        }

        for (Row row : styleTable.getRows()) {
            String value = row.getValue();
            if (value == null) continue;


            if (value.startsWith("[") && value.endsWith("]")) {
                String inner = value.substring(1, value.length() - 1);
                String[] styles = inner.split(",");
                for (String style : styles) {
                    String trimmed = style.trim().replace("\"", "").replace("'", "");
                    if (!trimmed.endsWith(".css")) {
                        return false;
                    }
                }
            }

            else {
                String trimmed = value.trim().replace("\"", "").replace("'", "");
                if (!trimmed.endsWith(".css")) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isVariableRedefinedInSameScope(SymbolTable fullTable) {
        SymbolTable vars = new SymbolTable();
        Set<String> seen = new HashSet<>();

        for (Row row : fullTable.getRows()) {
            if (row.getType().equals("let") || row.getType().equals("var") || row.getType().equals("const")) {
                vars.AddRow(row);
            }
        }

        for (Row row : vars.getRows()) {
            String key = row.getName() + "@" + row.getScope();
            if (seen.contains(key)) {
                return true;
            }
            seen.add(key);
        }

        return false;
    }

    //---------Helper Function----------------//

    public SymbolTable filterRowsByName(SymbolTable table, String name) {
        SymbolTable filtered = new SymbolTable();
        for (Row row : table.getRows()) {
            if (name.equals(row.getName())) {
                filtered.AddRow(row);
            }
        }
        return filtered;
    }

    public SymbolTable filterRowsByType(SymbolTable table, String type) {
        SymbolTable filtered = new SymbolTable();
        for (Row row : table.getRows()) {
            if (type.equals(row.getType())) {
                filtered.AddRow(row);
            }
        }
        return filtered;
    }
}
