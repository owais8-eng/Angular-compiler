package Antlr.symbolTable;

import java.util.Stack;

import AST.returnStatement;
import AST.thisCall;
import Antlr.symbolTable.class_object.UniqueName;

public class DouplicateSelectorSymbolTable {

    private Stack<UniqueName> duplicateSelector = new Stack<>();
        
    public DouplicateSelectorSymbolTable() {
    }
    
    public Stack<UniqueName> getDouplicateSelector() {
        return this.duplicateSelector;
    }

    public void setDouplicateSelector(Stack<UniqueName> douplicateSelector) {
        this.duplicateSelector = douplicateSelector;
    }
    
    public boolean addSet() {
        UniqueName selectorSet = new UniqueName();
        return this.duplicateSelector.add(selectorSet);
    }

    public void delSet() {
        this.getSet().print();
        this.duplicateSelector.pop();
    }

    public UniqueName getSet() {
        return this.duplicateSelector.peek();
    }

    public void addSelector(String name) {
        this.getSet().addVal(name);
    }

    
}
