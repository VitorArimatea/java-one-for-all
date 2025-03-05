package academy.arimatea.javaoneforall.javacore.Oexception.error.test;

public class StackOverflowTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
