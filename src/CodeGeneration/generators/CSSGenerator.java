package CodeGeneration.generators;

import CodeGeneration.CodeGenerator;
import AST.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class CSSGenerator implements CodeGenerator<App> {

    private final String staticCssFileName = "style.txt";
    private final String cssFolderPath = "assets/css/";

    public CSSGenerator() {}

    @Override
    public String generate(App node) {
        if (node == null) return "";
        StringBuilder sb = new StringBuilder();

        sb.append(staticCssFileName).append(" */\n");
        sb.append(readCssFile(staticCssFileName)).append("\n");

        if (node.getCssCodeList() != null) {
            for (cssCode code : node.getCssCodeList()) {
                sb.append(renderCss(code)).append("\n");
            }
        }

        return sb.toString();
    }

    @Override
    public void writeToFile(String content, String outputPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write(content);
        }
    }

    public String renderCss(cssCode css) {
        StringBuilder sb = new StringBuilder();

        if (css.getCssKeys() != null) {
            for (cssKey key : css.getCssKeys()) {
                if (key.getSies() == null ||key.getSies().isEmpty()) continue;

                String selector = key.getSies().get(0).getId();
                sb.append(".").append(selector).append(" {\n");

                if (css.getCssInners() != null) {
                    for (cssInner inner : css.getCssInners()) {
                        if (inner.getCssKey() == null ||inner.getCssKey().getSies() == null || inner.getCssKey().getSies().isEmpty()) continue;
                        String property = inner.getCssKey().getSies().get(0).getId();
                        String value = inner.getNumber() != null ? inner.getNumber() : inner.getId();
                       sb.append("   ").append(property).append(":").append(value).append(";\n");
                    }
                }
                sb.append("}\n");

            }
        }
        return sb.toString();
    }

    private String readCssFile(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get( cssFolderPath, filePath)));
        } catch (IOException e) {
            return "/* Failed to read file: " + filePath + " */";
        }
    }


}

