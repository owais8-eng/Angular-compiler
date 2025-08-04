package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class htmlVar extends ASTNode {
    public List<String> nameParts;

    public htmlVar() {
        super("html var");
    }

    public List<String> getNameParts() {
        return nameParts;
    }

    public void setNameParts(List<String> nameParts) {
        this.nameParts = nameParts;
    }

    @Override
    public String toString() {
        return "\nHtmlVar{" +
                "\nnameParts=" + nameParts +
                "\n}";
    }



}


