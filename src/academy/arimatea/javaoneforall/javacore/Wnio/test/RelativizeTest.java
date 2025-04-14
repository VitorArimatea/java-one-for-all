package academy.arimatea.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest {
    public static void main(String[] args) {
        Path absolute1 = Paths.get("/home/vitor");
        Path absolute2 = Paths.get("/user/local");
        Path absolute3 = Paths.get("/home/vitor/exercises/HelloWorld.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.20251404");

        System.out.println("\n1: " + absolute1.relativize(absolute3));
        System.out.println("\n2: " + absolute3.relativize(absolute1));
        System.out.println("\n3: " + absolute1.relativize(absolute2));
        System.out.println("\n4: " + relative1.relativize(relative2));
        // Exception System.out.println("\n5: " + absolute1.relativize(relative1));
    }
}
