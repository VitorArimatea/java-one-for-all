package academy.arimatea.javaoneforall.javacore.Uregex.test;

public class ScannerTest {
    public static void main(String[] args) {
        String text = "Gerald, Yen, Tris";
        String[] names = text.split(",");
        for (String name : names) {
            System.out.println(name.trim());
        }

    }
}
