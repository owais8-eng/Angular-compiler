package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class functionBody extends ASTNode{
 public List<Statement> statements;

    public functionBody() {
        super("functionBody");

    }
    public List<Statement> getStatement(){
        return  statements;
    }
    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "FunctionBodyNode{" +
                "statements=" + statements +
                '}';
    }
}
