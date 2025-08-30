package Antlr.symbolTable.class_object;

import java.util.HashSet;
import java.util.Set;

public class UniqueName {

    Set<String> set = new HashSet<>();

    public UniqueName() {
    }

    public Set<String> getSet() {
        return this.set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public boolean addVal(String name) {
        if (this.set.contains(name)) {
            return true;
        } else {
            this.set.add(name);
            return false;
        }
    }

    public void print() {
        System.out.println(this.set);
    }

    
}
