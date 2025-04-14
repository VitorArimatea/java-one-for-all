package academy.arimatea.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest {
    public static void main(String[] args) {
        Path dir = Paths.get("home/vitor");
        Path file = Paths.get("dev/file.txt");
        Path resolvePath = dir.resolve(file);
        System.out.println(resolvePath);

        Path absolute = Paths.get("/home/vitor");
        Path relative = Paths.get("dev");
        Path filePath = Paths.get("file.txt");

        System.out.println("1: " + absolute.resolve(relative));
        System.out.println("2: " + absolute.resolve(filePath));
        System.out.println("3: " + relative.resolve(absolute));
        System.out.println("4: " + relative.resolve(filePath));
        System.out.println("5: " + filePath.resolve(absolute));
        System.out.println("6: " + filePath.resolve(relative));
    }
}
