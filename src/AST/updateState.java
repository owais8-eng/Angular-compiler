package AST;

public class updateState extends ASTNode
{
    private variableName variableName;
    private ASTNode value;  // يمكن أن يكون subValue أو array أو map

    public updateState() {
        super("updateState");
    }

    public variableName getVariableName() {
        return variableName;
    }

    public void setVariableName(variableName variableName) {
        this.variableName = variableName;
    }

    public ASTNode getValue() {
        return value;
    }

    public void setValue(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UpdateState{" +
                "variableName=" + variableName +
                ", value=" + value +
                '}';
    }
}
