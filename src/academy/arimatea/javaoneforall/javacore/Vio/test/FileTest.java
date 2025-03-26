package academy.arimatea.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("file.tsx");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File Created? " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is directory? " + file.isDirectory());
            System.out.println("Is file? " + file.isFile());
            System.out.println("Is hidden? " + file.isHidden());
            System.out.println("Last modified: " +
                    Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            boolean exists = file.exists();

            if (exists) {
                boolean deleteFile = file.delete();
                System.out.println("File Deleted? " + deleteFile);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
