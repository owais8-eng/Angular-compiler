package AST;

public class Row {
    String name;
    String type;
    String value;
    String scope;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
    @Override
    public String toString() {
        return String.format("%-20s\t%-30s\t%-20s\t%-20s", name, value, type, scope);
    }

}
