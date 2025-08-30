package Antlr.symbolTable;

import java.util.Stack;

import Antlr.symbolTable.class_object.UniqueName;

public class VariableRedefinition {
 private Stack<UniqueName> variableRedefinition = new Stack<>();

    public VariableRedefinition() {}

    public Stack<UniqueName> getVariableRedefinition() {
        return this.variableRedefinition;
    }

    public void setVariableRedefinition(Stack<UniqueName> variableRedefinition) {
        this.variableRedefinition = variableRedefinition;
    }

    public boolean addSet() {
        UniqueName varSet = new UniqueName();
        return this.variableRedefinition.add(varSet);
    }

    public void delSet() {
        this.getSet().print();
        this.variableRedefinition.pop();
    }

    public UniqueName getSet() {
        return this.variableRedefinition.peek();
    }

    public void addVariable(String name) {
        this.getSet().addVal(name);
    }   
}
