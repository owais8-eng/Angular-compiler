package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class html extends ASTNode implements htmlContent{
  private String tagName;
  private htmlInside htmlInside;
  private List<htmlContent> contents;

    public html() {
        super("html");
    }
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public htmlInside getHtmlInside() {
        return htmlInside;
    }

    public void setHtmlInside(htmlInside htmlInside) {
        this.htmlInside = htmlInside;
    }

    public List<htmlContent> getContents() {
        return contents;
    }

    public void setContents(List<htmlContent> contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Html{tag=" + tagName + ", inside=" + htmlInside + ", contents=" + contents + "}";
    }




}
