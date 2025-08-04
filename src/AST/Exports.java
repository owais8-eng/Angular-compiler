package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class Exports extends ASTNode {

    public List<decorater> decorators;
    public List<String> ids;
    public classBody classBody;

    public Exports() {
        super("export");
    }

    public List<decorater> getDecorators() {
        return decorators;
    }

    public void setDecorators(List<decorater> decorators) {
        this.decorators = decorators;
    }

    public AST.classBody getClassBody() {
        return classBody;
    }

    public void setClassBody(AST.classBody classBody) {
        this.classBody = classBody;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Export :{");
        if (decorators != null && !decorators.isEmpty()) {
            stringBuilder.append("decorator :[");
            for (int i= 0;i < decorators.size();i++ ) {
                stringBuilder.append(decorators.get(i));
                if (i < decorators.size()-1) {
                    stringBuilder.append(",");
                }

            }
            stringBuilder.append("]");
        }
        if (ids != null && !ids.isEmpty()) {
            stringBuilder.append("class name and Parents classes :[");
            for (int i= 0;i < ids.size();i++ ) {
                stringBuilder.append(ids.get(i));
                if (i < ids.size()-1) {
                    stringBuilder.append("]");
                }
                stringBuilder.append("}");
            }
        }
        stringBuilder.append("class Body").append(classBody);
        stringBuilder.append("}");
        return stringBuilder.toString();


    }

    @Override
    public String generateCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if (decorators != null ){
            for (decorater dec : decorators) {
                stringBuilder.append(dec.generateCode()).append("\n");
            }
        }
        stringBuilder.append("export ");

        if (ids != null && !ids.isEmpty()) {
            stringBuilder.append("class").append(ids.get(0));
            if (ids.size() > 1) {
                stringBuilder.append("extends ");
                for (int i = 1; i < ids.size() ; i++) {
                    stringBuilder.append(ids.get(i));
                    if (i < ids.size()-1){
                        stringBuilder.append(", ");
                    }
                }
            }
        }
        stringBuilder.append("\n");

        if (classBody != null) {
            stringBuilder.append(classBody.generateCode());
        }
        stringBuilder.append("}\n");

        return stringBuilder.toString();

    }

}
