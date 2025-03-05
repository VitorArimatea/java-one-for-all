package academy.arimatea.javaoneforall.javacore.Qstrings.test;

public class StringTest {
    public static void main(String[] args) {
        String name = "Vítor"; // String constant pool
        String name2 = "Vítor";
        System.out.println(name);
        System.out.println(name == name2);
        name = name.concat(" Arimatéa"); // nome += " Arimatéa"
        System.out.println(name == name2);
        System.out.println(name);
        String name3 = new String("Vítor"); // 1 variável de referência, 2 objeto do tipo string, 3 uma string no pool string(Caso não exista)
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
