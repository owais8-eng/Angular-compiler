package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class html extends ASTNode{
  private String tagName;
  private htmlBody body;
  private htmlVar var;
  private htmlDot dot;
  private List<html> htmls;
  private List<String> ids;
  private htmlInside htmlInside;

    public html() {
        super("html");
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public htmlBody getBody() {
        return body;
    }

    public void setBody(htmlBody body) {
        this.body = body;
    }

    public htmlVar getVar() {
        return var;
    }

    public void setVar(htmlVar var) {
        this.var = var;
    }

    public htmlDot getDot() {
        return dot;
    }

    public void setDot(htmlDot dot) {
        this.dot = dot;
    }

    public List<html> getHtmls() {
        return htmls;
    }

    public void setHtmls(List<html> htmls) {
        this.htmls = htmls;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public AST.htmlInside getHtmlInside() {
        return htmlInside;
    }

    public void setHtmlInside(AST.htmlInside htmlInside) {
        this.htmlInside = htmlInside;
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder  = new StringBuilder("html : {");
      stringBuilder.append("tag name :").append(tagName);
      stringBuilder.append("html inside").append(htmlInside);
      stringBuilder.append("body").append(body);

        if (htmls != null && !htmls.isEmpty()) {
            stringBuilder.append("html :[");
            for (int i = 0; i < htmls.size(); i++) {
                stringBuilder.append(htmls.get(i));
                if (i < htmls.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (ids != null && !ids.isEmpty()) {
            stringBuilder.append("ids :[");
            for (int i = 0; i < ids.size(); i++) {
                stringBuilder.append(ids.get(i));
                if (i < ids.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("html var").append(var);
        stringBuilder.append("html dot").append(dot);
       stringBuilder.append("}");
        return stringBuilder.toString();



    }


}
