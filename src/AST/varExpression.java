package AST;

public class varExpression extends htmlExpression{
    private htmlVar var;

    public varExpression() {
        super("varExpression");
    }

    public htmlVar getHtmlVar() {
        return var;
    }

    public void setHtmlVar(htmlVar htmlVar) {
        this.var = htmlVar;
    }

    @Override
    public String toString() {
        return "varExpression{" + var + "}";
    }
}
