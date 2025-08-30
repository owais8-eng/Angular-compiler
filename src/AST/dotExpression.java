package AST;

public class dotExpression extends htmlExpression{

    private htmlDot htmlDot;

    public dotExpression() {
        super("dotExpression");
    }
    public htmlDot getHtmlDot() {
        return htmlDot;
    }

    public void setHtmlDot(htmlDot htmlDot) {
        this.htmlDot = htmlDot;
    }

    @Override
    public String toString() {
        return "dotExpression{" + htmlDot + "}";
    }



}
