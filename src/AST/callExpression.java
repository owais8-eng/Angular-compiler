package AST;

public class callExpression extends htmlExpression{
    private String label;
    private callFun fun;

    public callExpression() {
        super("callExpression");
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public callFun getFunction() {
        return fun;
    }

    public void setFunction(callFun function) {
        this.fun = function;
    }

    @Override
    public String toString() {
        return "callExpression{label=" + label + ", function=" + fun + "}";
    }

}
