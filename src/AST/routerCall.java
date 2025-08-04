package AST;
import java.util.Map;
public class routerCall extends callFun{

    private String routerName;
    private String path;
    private stateParam stateParam;
    private boolean isThis;

    public routerCall() {
        super("routerCall");
    }
    public boolean isThis() {
        return isThis;
    }

    public void setThis(boolean aThis) {
        isThis = aThis;
    }

    public String getRouterName() {
        return routerName;
    }

    public void setRouterName(String routerName) {
        this.routerName = routerName;
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
        return "RouterCall{" +
                "await=" + isAwait +
                ", this=" + isThis +
                ", routerName='" + routerName + '\'' +
                ", path='" + path + '\'' +
                ", stateParam=" + stateParam +
                '}';
    }

}
