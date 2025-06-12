package AST;



public class Statement extends ASTNode {
   public Variable variable;
   public thisCall call;
   public Print printt;
   public callFun callFun;

  public Statement() {
      super("Statement");
  }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public void setCall(thisCall call) {
        this.call = call;
    }

    public void setPrintt(Print printt) {
        this.printt = printt;
    }

    public void setCallFun(AST.callFun callFun) {
        this.callFun = callFun;
    }

    public Variable getVariable() {
        return variable;
    }

    public thisCall getCall() {
        return call;
    }

    public Print getPrintt() {
        return printt;
    }

    public AST.callFun getCallFun() {
        return callFun;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "variable=" + variable +
                ", call=" + call +
                ", printt=" + printt +
                ", callFun=" + callFun +
                '}';
    }
}
