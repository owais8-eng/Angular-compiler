package CodeGeneration.generators;

import CodeGeneration.CodeGenerator;
import AST.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLGenerator implements CodeGenerator<App> {

    public HTMLGenerator() {}

    @Override
    public String generate(App node) {
        if (node == null) return "";
        StringBuilder sb = new StringBuilder();

        boolean hasTemplateUrl = false;

        if (node.getExports() != null) {
            for (Exports exp : node.getExports()) {
                for (decorater decorater : exp.getDecorators()) {
                    if (decorater.getConfig() instanceof ComponentConfig config) {
                        if (config.getTemplateUrl() != null) {
                            String filePath = config.getTemplateUrl().getValue();
                            try {
                                String content = java.nio.file.Files.readString(java.nio.file.Paths.get(filePath));
                                sb.append(content).append("\n");
                                hasTemplateUrl = true;
                            } catch (IOException e) {
                                sb.append("<!-- Failed to read template file: ").append(filePath).append(" -->\n");
                            }
                        }
                    }
                }
            }
        }
        if (!hasTemplateUrl) {
            sb.insert(0,
                    "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                            "    <link rel=\"stylesheet\" href=\"generatorFiles/style.css\">\n" +
                            "    <style></style>\n" +
                            "    <title>Generated Page</title>\n" +
                            "</head>\n<body>\n"
            );
            sb.append("</body>\n</html>");
        }

        return sb.toString();
    }


    @Override
    public void writeToFile(String content, String outputPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write(content);
        }
    }

    // render <tag ...> ... </tag>
    private String renderHtml(html h) {
        String tag = h.getTagName();
        if (tag == null || tag.isEmpty()) tag = "div";

        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tag);

        if (h.getHtmlInside() != null) {
            sb.append(renderHtmlInside(h.getHtmlInside()));
        }

        sb.append(">");

        if (h.getContents() != null) {
            for (htmlContent content : h.getContents()) {
                sb.append(renderHtmlContent(content));
            }
        }
        sb.append("</").append(tag).append(">").append("\n");
        return sb.toString();
    }

    private String renderHtmlInside(htmlInside inside) {
        StringBuilder sb = new StringBuilder();

        if (inside.getProperty() != null) {
            String prop = inside.getProperty();
            String value = inside.getTextContent() != null ? inside.getTextContent() : "";
            sb.append(" ").append(prop).append("=\"").append(value).append("\"");
        }
        if (inside.getHtmlIds() != null) {
            for (htmlId id : inside.getHtmlIds()) {
                sb.append(" ").append(renderHtmlId(id));
            }
        }

        if (inside.getHtmlClasses() != null) {
            for (htmlClass cls : inside.getHtmlClasses()) {
                sb.append(" ").append(renderHtmlClass(cls));
            }
        }
        if (inside.getTextContent() != null && inside.getProperty() == null) {
            sb.append(">").append(inside.getTextContent());
        }


        return sb.toString();
    }

    private String renderHtmlContent(htmlContent node) {
        if (node instanceof html h) return renderHtml(h); // nested tag
        if (node instanceof htmlInside inside) return renderHtmlInside(inside);
        if (node instanceof htmlBody body) return renderHtmlBody(body);
        if (node instanceof htmlExpression expr) return renderHtmlExpression(expr);

        return "";
    }

    private String renderHtmlId(htmlId node) {
        return "id=\"" + node.getId() + "\"";
    }

    private String renderHtmlClass(htmlClass node) {
        return "class=\"" + node.getClassName() + "\"";
    }

    private String renderHtmlDot(htmlDot node) {
        return "{{ " + node.getIdLeft() + "." + node.getIdright() + " }}";
    }

    private String renderHtmlVar(htmlVar node) {
        return " " + String.join(" ", node.getNameParts()) + " ";
    }

    private String renderHtmlExpression(htmlExpression expr) {
        if (expr instanceof dotExpression dotExpr) {
            return renderHtmlDot(dotExpr.getHtmlDot());
        }
        if (expr instanceof varExpression varExpr) {
            return renderHtmlVar(varExpr.getHtmlVar());
        }
        if (expr instanceof callExpression callExpr) {
            String label = callExpr.getLabel() != null ? callExpr.getLabel() : "call";
            return "{{ " + label + "() }}";
        }
        return "";
    }



    private String renderHtmlBody(htmlBody body) {
        StringBuilder sb = new StringBuilder();

        if (body.getMapMethod2() != null) sb.append("<!-- mapMethod2 -->");
        if (body.getHh() != null) sb.append("<!-- hh -->");

        return sb.toString();
    }

}
