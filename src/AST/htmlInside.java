package AST;

import Antlr.BaseVisitor;
import AST.htmlContent;

import java.util.List;

public class htmlInside extends ASTNode implements htmlContent{
    public  String property;
    public List<htmlId> htmlIds;
    public List<htmlClass> htmlClasses;
    private String textContent;
    public List<htmlContent> children;

    public htmlInside() {
        super("html Imside");
    }

    public String getProperty() {
        return property;
    }

    public void  setProperty(String property) {
        this.property = property;
    }

    public List<htmlId> getHtmlIds() {
        return htmlIds;
    }

    public void setHtmlIds(List<htmlId> htmlIds) {
        this.htmlIds = htmlIds;
    }

    public List<htmlClass> getHtmlClasses() {
        return htmlClasses;
    }

    public void setHtmlClasses(List<htmlClass> htmlClasses) {
        this.htmlClasses = htmlClasses;
    }

    public List<htmlContent> getChildrens() { return children; }

    public void setChildren(List<htmlContent> children) { this.children = children; }

    public String getTextContent() {
        return textContent;
    }

    public void  setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public String toString() {
   StringBuilder stringBuilder = new StringBuilder("html Inside :{");


        if (htmlClasses != null && !htmlClasses.isEmpty()) {
            stringBuilder.append(" html class [");
            for (int i = 0; i < htmlClasses.size(); i++) {
                stringBuilder.append(htmlClasses.get(i));
                if (i < htmlClasses.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }



}
