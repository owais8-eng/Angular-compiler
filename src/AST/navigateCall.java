package AST;

import java.util.Map;

public class navigateCall extends callFun{
    private  String path;
    private stateParam stateParam;

    public navigateCall() {
        super("navigateCall");
    }
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public stateParam getStateParam() {
        return stateParam;
    }

    public void setStateParam(stateParam stateParam) {
        this.stateParam = stateParam;
    }
    @Override
    public String toString() {
        return "NavigateCall{" +
                "await=" + isAwait +
                ", path='" + path + '\'' +
                ", stateParam=" + stateParam +
                '}';
    }

}
