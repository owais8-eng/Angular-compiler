package AST;

public class stateParam extends ASTNode {
    private String key;
    private ASTNode value;

    public stateParam() {
        super("stateParam");
    }
    public String getKey() {
        return key;
    }

    public ASTNode getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StateParamEntry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }

}
