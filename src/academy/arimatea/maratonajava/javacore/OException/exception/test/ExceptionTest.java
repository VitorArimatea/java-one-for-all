package academy.arimatea.maratonajava.javacore.OException.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        createNewFile();
    }

    private static void createNewFile() {
        File file = new File("file" + File.separator + "vitor.txt");

        try {
            boolean isFileCreated = file.createNewFile();
            System.out.println("File created successfully: " + isFileCreated);
        } catch (IOException e) {
            System.out.println("Failed to create file");
            e.printStackTrace();
        }
    }
}
