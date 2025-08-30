package Antlr.symbolTable;

import java.util.Stack;

import Antlr.symbolTable.class_object.UniqueName;

public class InvalidStyleUrls {
    private Stack<UniqueName> invalidStyleUrls = new Stack<>();

    public InvalidStyleUrls() {}

    public Stack<UniqueName> getInvalidStyleUrls() {
        return this.invalidStyleUrls;
    }

    public void setInvalidStyleUrls(Stack<UniqueName> invalidStyleUrls) {
        this.invalidStyleUrls = invalidStyleUrls;
    }

    public boolean addSet() {
        UniqueName styleSet = new UniqueName();
        return this.invalidStyleUrls.add(styleSet);
    }

    public void delSet() {
        this.getSet().print();
        this.invalidStyleUrls.pop();
    }

    public UniqueName getSet() {
        return this.invalidStyleUrls.peek();
    }

    public void addStyle(String styleUrl) {
        this.getSet().addVal(styleUrl);
    }
}
