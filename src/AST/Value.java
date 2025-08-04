package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class Value extends ASTNode {
    public SubValue subValue;
    public Array array;
    public html html;
    public Map  map;

    public Value() {
        super("Value");
    }

    public SubValue getSubValue() {
        return subValue;
    }

    public void setSubValue(SubValue subValue) {
        this.subValue = subValue;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public AST.html getHtml() {
        return html;
    }

    public void setHtml(AST.html html) {
        this.html = html;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "\nValue{" +
                "\n subValue=" + subValue +
                "\n, array=" + array +
                "\n, html=" + html +
                "\n, map=" + map +
                "\n}";
    }


}
