package AST;

import java.util.List;

public class variableName extends ASTNode{

    public String firstPart;
    public List<String> dotIds;
    public variableName() {
        super("variable name");
    }

    public String getFirstPart() {
        return firstPart;
    }

    public void setFirstPart(String firstPart) {
        this.firstPart = firstPart;
    }

    public List<String> getDotIds() {
        return dotIds;
    }

    public void setDotIds(List<String> dotIds) {
        this.dotIds = dotIds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(firstPart);
        for (String id : dotIds) {
            sb.append(".").append(id);
        }
        return sb.toString();
    }
}
