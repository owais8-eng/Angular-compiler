package AST;

import Antlr.BaseVisitor;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Variable extends ASTNode {

    private List<String> nameParts;
    public String modifier;
    public String visibility;
    public String datatype;
    public vv vvs;
    public arrayType arrayType;
    public VariableValue value;

    public Variable() {
        super("variable");
    }


    public List<String> getNameParts() {
        return nameParts;
    }

    public void setNameParts(List<String> nameParts) {
        this.nameParts = nameParts;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public vv getVvNode() {
        return vvs;
    }

    public void setVvNode(vv vvNode) {
        this.vvs = vvNode;
    }

    public arrayType getArrayType() {
        return arrayType;
    }

    public void setArrayTypeNode(arrayType arrayTypeNode) {
        this.arrayType = arrayTypeNode;
    }

    public VariableValue getValue() {
        return value;
    }

    public void setValue(VariableValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Variable{");
        sb.append("modifier=").append(modifier).append(", ");
        sb.append("visibility=").append(visibility).append(", ");
        sb.append("nameParts=").append(nameParts).append(", ");
        sb.append("datatype=").append(datatype).append(", ");
        sb.append("vvNode=").append(vvs).append(", ");
        sb.append("arrayTypeNode=").append(arrayType).append(", ");
        sb.append("value=").append(value);
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generateCode() {
        StringBuilder sb = new StringBuilder();

        if (visibility != null && !visibility.isEmpty()) {
            sb.append(visibility).append(" ");
        }
        if (modifier != null && !modifier.isEmpty()) {
            sb.append(modifier).append(" ");
        }
        if (nameParts != null && !nameParts.isEmpty()) {
            sb.append(String.join(".",nameParts));
        }
        if (datatype != null && !datatype.isEmpty()) {
            sb.append(": ").append(datatype);
            if (arrayType != null) {
                sb.append("[]");
            }
        }
        if (value != null) {

            sb.append(" = ").append(value.generateCode());
        }
        sb.append(";");

        return  sb.toString();

    }



}
