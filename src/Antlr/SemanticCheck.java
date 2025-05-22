
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
    public SemanticCheck(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    boolean check(){
              return true;
    }

    boolean checkDuplicateComponentSelector(SymbolTable symbolTable) {
    Set<String> seenSelectors = new HashSet<>();

    for (Row row : symbolTable.getRows()) {
       if (row != null && "selector".equals(row.getName()))
       {
           String selector = row.getValue();
           if (seenSelectors.contains(selector)) {
               System.err.println("Semantic error :Duplicate selector found ->' "+ selector + "'");
               return  false;
           }
           seenSelectors.add(selector);
       }
    }
    return true;
    }

    boolean checkNonvoidFunctionReturn(SymbolTable symbolTable) {
        for (Row row : symbolTable.getRows()) {
            if (row.getType().equals("function"))  {
                String functionName = row.getName();
                String returnType =  extractReturnType(row.getType());

                if (!"void".equalsIgnoreCase(returnType)) {
                    if (!row.getValue().toLowerCase().contains("return")) {
                        System.err.println("Semantic error :function '" + functionName +"'");
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private String extractReturnType(String typeString) {
        if (typeString.contains(":")) {
            return typeString.split(":")[1];
        }
        return "void";
    }

    private final List<Exports> exportNodes = new ArrayList<>();

    public void addExportNode(Exports exportNode) {
        exportNodes.add(exportNode);
    }

    public boolean isClassBodyMissing(SymbolTable symbolTable){
        for (Row row : symbolTable.getRows()){
            if (row.getType().equals("class")) {
                String className = row.getName();

                for (Exports exp : exportNodes) {
                if (exp.getIds().get(0).equals(className)){
                    if (exp.getClassBody() == null) {
                        return true;
                    }
                }
            }
            }

        }
        return  false;
    }



}
