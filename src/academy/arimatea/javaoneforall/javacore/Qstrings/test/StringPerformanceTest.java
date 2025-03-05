package academy.arimatea.javaoneforall.javacore.Qstrings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        concatString(100);
        System.out.println("Tempo gasto para String " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Builder " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Buffer " + (end - start) + "ms");
    }

    private static void concatString(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text+=i;
        }
    }

    private static void concatStringBuilder(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int length) {
        StringBuffer sb = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }
}
