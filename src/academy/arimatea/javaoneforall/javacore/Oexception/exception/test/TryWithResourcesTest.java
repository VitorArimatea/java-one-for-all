package academy.arimatea.javaoneforall.javacore.Oexception.exception.test;

import academy.arimatea.javaoneforall.javacore.Oexception.exception.domain.Reader1;
import academy.arimatea.javaoneforall.javacore.Oexception.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Reader1 reader = new Reader1(); Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFileOld() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
        }
    }
}
