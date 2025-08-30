package Antlr;

import AST.*;

import CodeGeneration.generators.CSSGenerator;
import CodeGeneration.generators.HTMLGenerator;
import CodeGeneration.generators.JSGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {

     // Important : to print Symbol table comment visit method in BaseVisitor

     String[] sources = {"App-test.txt", "Add-test.txt"};
     for (String source : sources) {
      CharStream charStream = fromFileName(source);
      AngLexer lexer = new AngLexer(charStream);
      CommonTokenStream token = new CommonTokenStream((TokenSource) lexer);
      AngParser parser = new AngParser(token);

      ParseTree tree = parser.app();
      BaseVisitor visitor = new BaseVisitor();
      App app = (App) visitor.visit(tree);
      System.out.print(app);
      String outputHtmlFile;
      String jsVarName;

      if (source.toLowerCase().contains("add")) {
       outputHtmlFile = "generatorFiles/add-product.html";
       jsVarName = "AddProduct";
      } else {
       outputHtmlFile = "generatorFiles/app-product.html";
       jsVarName = "Product";
      }

      HTMLGenerator htmlGenerator = new HTMLGenerator();
      String htmlCode = htmlGenerator.generate(app);
      htmlGenerator.writeToFile(htmlCode, outputHtmlFile);
      System.out.println("HTML generated : \n");

      CSSGenerator cssGenerator = new CSSGenerator();
      String cssContent = cssGenerator.generate(app);
      cssGenerator.writeToFile(cssContent, "generatorFiles/style.css");
      System.out.println("CSS generated successfully!");

      JSGenerator jsGenerator = new JSGenerator();
      String jsCode = jsGenerator.renderProductsDOM(jsVarName);
      String jsOutputFile = outputHtmlFile.replace(".html", ".js");
      jsGenerator.writeToFile(jsCode, jsOutputFile);
      System.out.println("JavaScript generated successfully:\n" );
     }
    }
}