package Antlr.symbolTable;

import java.util.Stack;

import Antlr.symbolTable.class_object.UniqueName;

public class FunctionReturnMismatch {
    
    private Stack<UniqueName> functionReturnMismatch = new Stack<>();

    public FunctionReturnMismatch() {}

    public Stack<UniqueName> getFunctionReturnMismatch() {
        return this.functionReturnMismatch;
    }

    public void setFunctionReturnMismatch(Stack<UniqueName> functionReturnMismatch) {
        this.functionReturnMismatch = functionReturnMismatch;
    }

    public boolean addSet() {
        UniqueName funcSet = new UniqueName();
        return this.functionReturnMismatch.add(funcSet);
    }

    public void delSet() {
        this.getSet().print();
        this.functionReturnMismatch.pop();
    }

    public UniqueName getSet() {
        return this.functionReturnMismatch.peek();
    }

    public void addFunction(String functionName) {
        this.getSet().addVal(functionName);
    }
}
