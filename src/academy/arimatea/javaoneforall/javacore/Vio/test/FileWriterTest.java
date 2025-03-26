package academy.arimatea.javaoneforall.javacore.Vio.test;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String textInput = input.nextLine();

        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(textInput + "\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
