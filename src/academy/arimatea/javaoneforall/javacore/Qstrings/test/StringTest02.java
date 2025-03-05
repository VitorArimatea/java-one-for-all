package academy.arimatea.javaoneforall.javacore.Qstrings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = " Peter";
        String numbers = "0123456";

        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name);
        name = name.replace("t", "tt");
        name = (name.replace("P", "B"));
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(numbers.length());
        System.out.println(numbers.substring(3));
        System.out.println(numbers.substring(4, 6));
        System.out.println(name.trim());
    }
}
