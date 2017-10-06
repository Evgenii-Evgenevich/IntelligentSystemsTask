/**
 * Created by EE on 04.10.2017.
 */

package task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    // is the path contain the keyword
    public static boolean containKeyword(Path path, String keyword) {
        try {
            return Files.lines(path).anyMatch(line -> line.contains(keyword));
        }
        catch (IOException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        Path srcPath = Paths.get("c:/program files/java/jdk1.8.0_112/src.unzip");

        Files.walk(srcPath)
                .filter(path -> !Files.isDirectory(path))
                .filter(path -> Main.containKeyword(path, "transient"))
                .filter(path -> Main.containKeyword(path, "volatile"))
                .forEachOrdered(System.out::println);
    }
}
