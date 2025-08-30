package Antlr;

import AST.Row;
import AST.SymbolTable;

import java.util.*;

public class SemanticCheck {

    private SymbolTable symbolTable;
    private ErrorSet douplicateSelectorSet = new ErrorSet();
    private ErrorSet functionReturnMismatchSet = new ErrorSet();
    private ErrorSet invalidStyleUrlsSet = new ErrorSet();
    private ErrorSet invalidTemplateUrlSet = new ErrorSet();
    private ErrorSet variableRedefinitionSet = new ErrorSet();

    public SemanticCheck() {
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public boolean check(SymbolTable fullTable) {
        boolean isValid = true;

        if (checkDuplicateComponentSelector(fullTable)) {
            douplicateSelectorSet.addSet();
            for (Row row : filterRowsByName(fullTable, "selector").getRows()) {
                douplicateSelectorSet.addVal(row.getValue());
            }
            isValid = false;
        }

        if (isFunctionReturnTypeMismatched(fullTable)) {
            functionReturnMismatchSet.addSet();
            for (Row row : filterRowsByType(fullTable, "function").getRows()) {
                functionReturnMismatchSet.addVal(row.getValue());
            }
            isValid = false;
        }

        if (!isValidTemplateUrl(fullTable)) {
            invalidTemplateUrlSet.addSet();
            for (Row row : filterRowsByName(fullTable, "templateUrl").getRows()) {
                invalidTemplateUrlSet.addVal(row.getValue());
            }
            isValid = false;
        }

        if (!isValidStyleUrls(fullTable)) {
            invalidStyleUrlsSet.addSet();
            for (Row row : filterRowsByName(fullTable, "styleUrls").getRows()) {
                invalidStyleUrlsSet.addVal(row.getValue());
            }
            isValid = false;
        }

        if (isVariableRedefinedInSameScope(fullTable)) {
            variableRedefinitionSet.addSet();
            for (Row row : fullTable.getRows()) {
                if (row.getType().equals("let") || row.getType().equals("var") || row.getType().equals("const")) {
                    variableRedefinitionSet.addVal(row.getName());
                }
            }
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
            if (!declared.equals(actual)) return true;
        }
        return false;
    }

    public boolean isValidTemplateUrl(SymbolTable fullTable) {
        SymbolTable templateTable = filterRowsByName(fullTable, "templateUrl");
        for (Row row : templateTable.getRows()) {
            String value = row.getValue();
            if (value == null || !value.endsWith(".html")) return false;
        }
        return true;
    }

    public boolean isValidStyleUrls(SymbolTable fullTable) {
        SymbolTable styleTable = new SymbolTable();
        for (Row row : fullTable.getRows()) {
            String name = row.getName();
            if (name != null && name.equalsIgnoreCase("styleUrls")) styleTable.AddRow(row);
        }
        for (Row row : styleTable.getRows()) {
            String value = row.getValue();
            if (value == null) continue;
            if (value.startsWith("[") && value.endsWith("]")) {
                String inner = value.substring(1, value.length() - 1);
                String[] styles = inner.split(",");
                for (String style : styles) {
                    String trimmed = style.trim().replace("\"", "").replace("'", "");
                    if (!trimmed.endsWith(".css")) return false;
                }
            } else {
                String trimmed = value.trim().replace("\"", "").replace("'", "");
                if (!trimmed.endsWith(".css")) return false;
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
            if (seen.contains(key)) return true;
            seen.add(key);
        }
        return false;
    }

    public SymbolTable filterRowsByName(SymbolTable table, String name) {
        SymbolTable filtered = new SymbolTable();
        for (Row row : table.getRows()) {
            if (name.equals(row.getName())) filtered.AddRow(row);
        }
        return filtered;
    }

    public SymbolTable filterRowsByType(SymbolTable table, String type) {
        SymbolTable filtered = new SymbolTable();
        for (Row row : table.getRows()) {
            if (type.equals(row.getType())) filtered.AddRow(row);
        }
        return filtered;
    }

    public void printErrors() {
        boolean hasErrors = false;

        if (!douplicateSelectorSet.isEmpty()) {
            hasErrors = true;
            System.err.println("تم العثور على محددات مكونات مكررة:");
            douplicateSelectorSet.getValues().forEach(val -> System.err.println("  - " + val));
        }

        if (!functionReturnMismatchSet.isEmpty()) {
            hasErrors = true;
            System.err.println("وجود اختلاف بين نوع القيمة المرجعة للوظائف:");
            functionReturnMismatchSet.getValues().forEach(val -> System.err.println("  - " + val));
        }

        if (!invalidTemplateUrlSet.isEmpty()) {
            hasErrors = true;
            System.err.println("روابط القوالب غير صحيحة (يجب أن تنتهي بـ .html):");
            invalidTemplateUrlSet.getValues().forEach(val -> System.err.println("  - " + val));
        }

        if (!invalidStyleUrlsSet.isEmpty()) {
            hasErrors = true;
            System.err.println("روابط ملفات التنسيق غير صحيحة (يجب أن تنتهي بـ .css):");
            invalidStyleUrlsSet.getValues().forEach(val -> System.err.println("  - " + val));
        }

        if (!variableRedefinitionSet.isEmpty()) {
            hasErrors = true;
            System.err.println("إعادة تعريف متغيرات في نفس النطاق:");
            variableRedefinitionSet.getValues().forEach(val -> System.err.println("  - " + val));
        }

        if (!hasErrors) {
            System.out.println("لا توجد أخطاء دلالية.");
        }
    }
}
