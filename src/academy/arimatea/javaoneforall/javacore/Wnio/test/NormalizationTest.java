package academy.arimatea.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizationTest {
    public static void main(String[] args) {
        String projectDirectory = "home/vitor/dev";
        String fileTxt = "../../file.txt";
        Path pathFile = Paths.get(projectDirectory, fileTxt);
        System.out.println(pathFile.normalize());

        Path pathFile2 = Paths.get("/home/./vitor/./dev/");
        System.out.println(pathFile2.normalize());
    }
}
