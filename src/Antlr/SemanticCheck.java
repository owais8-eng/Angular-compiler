
package Antlr;

import AST.Exports;
import AST.Row;
import AST.SymbolTable;

import java.util.*;

public class SemanticCheck {


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
              return true;
    }

    boolean checkDuplicateComponentSelector(SymbolTable symbolTable) {
    Set<String> seenSelectors = new HashSet<>();
          boolean hasDuplicates = false;
    for (Row row : symbolTable.getRows()) {
       if (row != null && "selector".equals(row.getName()))
       {
           String selector = row.getValue();
           if (!seenSelectors.contains(selector)) {
               System.err.println("Semantic error :Duplicate selector found ->' "+ selector + "'");
               hasDuplicates = true;
           }
           seenSelectors.add(selector);
       }
    }
    return !hasDuplicates;
    }

    public boolean isClassBodyMissing(SymbolTable symbolTable) {
     for (Row row :symbolTable.getRows()) {
         if (row.getType().equals("class") && row.getValue().equals("class_missing_body")){
             System.err.println("semantic error '" + row.getName() + "' class should have a body");
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
                    System.err.println("MisMatch datatype in function :" + row.getName());
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
}
