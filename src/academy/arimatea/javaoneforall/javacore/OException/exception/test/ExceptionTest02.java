package academy.arimatea.javaoneforall.javacore.OException.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    private static void createNewFile() throws IOException {
        File file = new File("file" + File.separator + "vitor.txt");

        try {
            boolean isFileCreated = file.createNewFile();
            System.out.println("File created successfully: " + isFileCreated);
        } catch (IOException e) {
            System.out.println("Failed to create file");
            e.printStackTrace();
            throw e;
        }
    }
}
