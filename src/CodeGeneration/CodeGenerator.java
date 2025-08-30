package CodeGeneration;

import AST.ASTNode;
import AST.htmlContent;

import java.io.IOException;

public interface CodeGenerator<T extends ASTNode> {
    String generate(T node);


    void writeToFile(String content , String outputPath) throws IOException;
}
