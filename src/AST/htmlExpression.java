package AST;

public abstract class htmlExpression extends ASTNode implements htmlContent{
    public htmlExpression(String nodeName) {
        super(nodeName);
    }
}
