package AST;

public class arrayType extends ASTNode{

    private String dataType;

    public arrayType() {
        super("type");
    }
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    @Override
    public String toString() {
        if (dataType == null) {
            return "ArrayType: []";
        } else {
            return "ArrayType: [" + dataType + "]";
        }
    }





}
