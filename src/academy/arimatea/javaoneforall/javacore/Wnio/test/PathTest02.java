package academy.arimatea.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            Path directoryCreated = Files.createDirectory(folderPath);
            System.out.println(directoryCreated);
        }

        Path subFolderPath = Paths.get("folder/subfolder/subsubfolder/subsubsubfolder");
        Files.createDirectories(subFolderPath);

        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path fileCreated = Files.createFile(filePath);
            System.out.println("File created: " + fileCreated);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "fileRenamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
