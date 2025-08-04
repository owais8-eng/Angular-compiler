package AST;

import java.util.ArrayList;
import java.util.List;

public class StateParamsContainer extends ASTNode{
    private List<stateParam> params;

    public StateParamsContainer() {
        super("StateParamsContainer");
        this.params = new ArrayList<>();
    }

    public List<stateParam> getParams() {
        return params;
    }

    public void setParams(List<stateParam> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "StateParamsContainer{" +
                "params=" + params +
                '}';
    }
}
