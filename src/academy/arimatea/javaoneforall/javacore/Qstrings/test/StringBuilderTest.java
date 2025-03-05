package academy.arimatea.javaoneforall.javacore.Qstrings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String name = "Vítor";
        name = name.concat(" Arimatéa");
        System.out.println(name.intern());

        StringBuilder sb = new StringBuilder("Vítor Arimatéa");
        sb.append(" Dev").append(" Virado").append(" No Jiraya");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(20, 22);
        System.out.println(sb);
    }
}
