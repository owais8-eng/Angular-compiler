package AST;

public class Template extends  ASTNode {
    private html value;

    public Template() {
        super("Template");

    }

    public html getValue() {
        return value;
    }

    public void setValue(html value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Template{" +
                "value='" + value + '\'' +
                '}';
    }
}
