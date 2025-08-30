package Antlr.symbolTable.class_object;

import java.util.Stack;

public class AttributeStack {
    Stack<String> attributes = new Stack<>();

    public AttributeStack() {
    }
    
    public void addAtt(String name) {
        if (!this.attributes.contains(name)) {
            this.attributes.push(name);
        }
    }

    public String print() {
        String result = "";
        for (int i = 0; i < this.attributes.size(); ++i) {
            result += this.attributes.peek() + " ";
        }
        return result;
    }

    public void clear() {
        this.attributes.clear();
    }

    public int size() {
        return this.attributes.size();
    }

    public String getById(int i) {
        return this.attributes.pop();
    }
        
}
