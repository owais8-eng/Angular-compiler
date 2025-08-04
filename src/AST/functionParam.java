package AST;

import Antlr.BaseVisitor;

public class functionParam extends ASTNode {
    public String type;
    public String id;

    public functionParam() {
        super("functionParam");
    }

   public String getType() {return  type;}

    public void  setType(String type) {
        this.type = type;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("function parameter : {");
        sb.append("id: ").append(id);
        if (type != null) {
            sb.append(", type: ").append(type);
        }
        sb.append("}");
        return sb.toString();
    }


}
