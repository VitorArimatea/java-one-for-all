package academy.arimatea.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("folder");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("The Directory has been created? " + isDirectoryCreated);

        File file = new File(fileDirectory, "file.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("File has been created? " + isFileCreated);

        File fileRenamed = new File(fileDirectory, "expectancy.txt");
        boolean isRenamed = file.renameTo(fileRenamed);
        System.out.println("File has been renamed? " + isRenamed);

        File directoryRenamed = new File("folderRenamed");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("The Directory has been renamed? " + isDirectoryRenamed);
    }
}
