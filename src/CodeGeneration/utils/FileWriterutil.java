package CodeGeneration.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterutil {

    public static void write(String content , String path) throws IOException {
        Path p = Paths.get(path);
        if (p.getParent() != null) {
            Files.createDirectories(p.getParent());
        }
        Files.write(p,content.getBytes(StandardCharsets.UTF_8));
    }
}
