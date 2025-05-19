
package Antlr;

import AST.Row;
import AST.SymbolTable;

import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SemanticCheck {

    private  SymbolTable symbolTable;
    Stack<String> scopeStack = new Stack<>();
    public SymbolTable getsymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    public SemanticCheck(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    boolean check(){
              return true;
    }

    public boolean isFirstElementSelector(AngParser.ComponentConfigContext ctx) {
        if (ctx == null || ctx.selector() == null) {
            return false;
        }

        return ctx.getChildCount() > 1 && ctx.getChild(1) instanceof AngParser.SelectorContext;
    }
}
