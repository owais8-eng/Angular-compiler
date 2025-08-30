package AST;

import Antlr.BaseVisitor;

import java.util.List;

public abstract class callFun extends ASTNode{

public boolean isAwait;
    public callFun(String type) {
        super(type);
    }

    public boolean isAwait() {
        return isAwait;
    }
    public void setAwait(boolean await) {
        this.isAwait = await;
    }

    @Override
    public String toString() {
           return (isAwait ? "await " : "") + "<callFun>";
    }


}
