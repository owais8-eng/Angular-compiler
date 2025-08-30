package AST;

import Antlr.BaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class functionBody extends ASTNode{
 public List<ASTNode> statements = new ArrayList<>();

    public functionBody() {
        super("functionBody");

    }
    public List<ASTNode> getStatement(){
        return  statements;
    }

    public void setStatements(List<ASTNode> statements) {
        this.statements = statements;
    }

    public void addStatement(ASTNode stmt) {
        statements.add(stmt);
        this.addChild(stmt);
    }

    @Override
    public String toString() {
        return "FunctionBodyNode{" +
                "statements=" + statements +
                '}';
    }


}
