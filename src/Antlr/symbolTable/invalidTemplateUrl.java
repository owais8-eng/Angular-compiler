package Antlr.symbolTable;

import java.util.Stack;

import Antlr.symbolTable.class_object.UniqueName;

public class invalidTemplateUrl {
    private Stack<UniqueName> invalidTemplateUrl = new Stack<>();

    public invalidTemplateUrl() {}

    public Stack<UniqueName> getInvalidTemplateUrl() {
        return this.invalidTemplateUrl;
    }

    public void setInvalidTemplateUrl(Stack<UniqueName> invalidTemplateUrl) {
        this.invalidTemplateUrl = invalidTemplateUrl;
    }

    public boolean addSet() {
        UniqueName urlSet = new UniqueName();
        return this.invalidTemplateUrl.add(urlSet);
    }

    public void delSet() {
        this.getSet().print();
        this.invalidTemplateUrl.pop();
    }

    public UniqueName getSet() {
        return this.invalidTemplateUrl.peek();
    }

    public void addUrl(String url) {
        this.getSet().addVal(url);
    }

}
