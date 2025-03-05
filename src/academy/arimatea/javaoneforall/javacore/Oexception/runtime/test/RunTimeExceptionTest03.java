package academy.arimatea.javaoneforall.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }

    private static String openConnection() {
        try {
            System.out.println("Opening file...");
            System.out.println("Writing to file...");
            System.out.println("Closing resource freed by OS");
            return "Connection Open";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing resource freed by the OS");
        }
        return null;
    }
}
