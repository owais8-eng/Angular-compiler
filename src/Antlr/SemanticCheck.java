
package Antlr;

import AST.Exports;
import AST.Row;
import AST.SymbolTable;

import java.util.*;

public class SemanticCheck {

    private String currentScope;
    private String propertyName;

    public void setCurrentScope(String currentScope) {
        this.currentScope = currentScope;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    private  SymbolTable symbolTable;

    Stack<String> scopeStack = new Stack<>();

    public SymbolTable getsymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public SemanticCheck() {

    }

    boolean check(){

        if (checkDuplicateComponentSelector(this.symbolTable)){
            System.err.println("Semantic error :Duplicate selector found ");
            return true;
        } else if (isClassBodyMissing(this.symbolTable)) {
            System.err.println("semantic error  class should have a body");
            return  true;
        } else if (isFunctionReturnTypeMismatched(this.symbolTable)) {
            System.err.println("MisMatch datatype in function ");
             return  true;
        } else if (!isValidTempleteUrl(symbolTable)) {
            System.err.println("Semantic error: 'templateUrl' must end with '.html'. Found: ");
            return true;
        } else if (!isVariableRedefinedInSameScope(symbolTable)) {
            System.err.println("Semantic error : Variable is already in this  scope ");
            return true;
        }else

        return false;
    }

    boolean checkDuplicateComponentSelector(SymbolTable symbolTable) {

    Set<String> seenSelectors = new HashSet<>();
     boolean hasDuplicates = false;
          for (Row row : symbolTable.getRows()) {
               if (row != null && "selector".equals(row.getName()))
               {
                   String selector = row.getValue();
                  if (!seenSelectors.contains(selector)) {
                     hasDuplicates = false;
                  }
                  seenSelectors.add(selector);
               }
          }
          return hasDuplicates;
    }

    public boolean isClassBodyMissing(SymbolTable symbolTable) {
     for (Row row :symbolTable.getRows()) {
         if (row.getType().equals("class") && row.getValue().equals("class_missing_body")){
             return true;
         }
     }
     return false;
    }

    public boolean isFunctionReturnTypeMismatched(SymbolTable symbolTable){
        for (Row row :symbolTable.getRows()) {

            if (row.getType().equals("function")) {
                String value = row.getValue();
                if (value == null && value.trim().isEmpty()) {
                    continue;
                }
                if (!value.contains(":")) {

                    continue;
                }
                String[] parts =value.split(":");
                String declared = parts[0].trim();
                String actual = parts[1].trim();
                if (!declared.equals(actual)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkSelectorIsFirst(SymbolTable symbolTable ,String scope) {

    for (Row row : symbolTable.getRows()) {
        if (row.getScope().equals(scope)) {
            if ("selector".equals(row.getName())) {
                return true;
            }else {
                System.err.println("'selector' must be first property in component config. Found '"+ row.getName() +"' instead.");
                return false;
            }
        }
    }
        System.err.println("Semantic error: No properties found in scope: " + scope);
        return false;
    }

    public boolean isValidTempleteUrl(SymbolTable symbolTable){
        boolean isValid = true;

        for (Row row : symbolTable.getRows()) {
            if ("templateUrl".equals(row.getName())) {
                String value = row.getValue();
                if (value == null || !value.endsWith(".html")) {
                    isValid = false;
                }
            }
        }
        return isValid;
    }

    public boolean isValidStyleUrls(SymbolTable symbolTable) {
        boolean isValid = true;

        for (Row row : symbolTable.getRows()) {
            if ("Styleurls".equals(row.getName())) {
                String value = row.getValue();
                if (value != null && value.startsWith("[") && value.endsWith("]")) {
                    String inner = value.substring(1, value.length() - 1); // remove brackets
                    String[] styles = inner.split(",");
                    for (String style : styles) {
                        String trimmed = style.trim().replace("\"", "").replace("'", "");
                        if (!trimmed.endsWith(".css")) {
                            System.err.println("Semantic error: 'styleUrls' element must end with '.css'. Found: " + trimmed);
                            isValid = false;
                        }
                    }
                } else if (value != null && !value.endsWith(".css")) {
                    isValid = false;
                }
            }
        }

        return isValid;
    }

    public boolean isVariableRedefinedInSameScope(SymbolTable symbolTable) {

        Set<String> seen = new HashSet<>();
        for (Row row : symbolTable.getRows()) {
            String key = row.getName() + "@" + row.getScope();

            if (seen.contains(key)) {
                return false;
            }
            seen.add(key);
        }
        return true;

     }
/*
    public boolean checkUndefinedPropertyAccess(SymbolTable symbolTable) {
        if (currentScope == null || propertyName == null) {
            throw new IllegalStateException("Current scope and property name must be set.");
        }
        for (Row row : symbolTable.getRows()) {
            if (row.getScope().equals(currentScope) && row.getName().equals(propertyName)) {
                return true;
            }
        }
        return false;
    }
*/
}