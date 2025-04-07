package academy.arimatea.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\vitor\\Documents\\2025\\Development\\Java Projects\\java-one-for-all\\folderRenamed\\expectancy.txt");
        Path path2 = Paths.get("C:\\Users\\vitor\\Documents\\2025\\Development\\Java Projects\\java-one-for-all\\folderRenamed", "expectancy.txt");
        Path path3 = Paths.get("C", "Users\\vitor\\Documents\\2025\\Development\\Java Projects\\java-one-for-all\\folderRenamed", "expectancy.txt");
        Path path4 = Paths.get("C", "Users", "vitor", "Documents", "2025", "Development", "Java Projects", "java-one-for-all", "folderRenamed", "expectancy.txt");
        System.out.println(path1.getFileName().toFile());
        System.out.println(path2.getFileName().toFile());
        System.out.println(path3.getFileName().toFile());
        System.out.println(path4.getFileName().toFile());
    }
}
