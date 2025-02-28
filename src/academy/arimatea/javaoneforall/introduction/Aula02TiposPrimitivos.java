package academy.arimatea.javaoneforall.introduction;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int castingExample = (int) 100000000000L;
        byte byteNumber = 127;
        short shortNumber = 32767;
        long numberLong = 999999999;
        int age = 20;
        int age2 = 25;
        double height = 1.75;
        Double height2 = 2.10;
        float weight = 67.5F;
        char initialName = 'v';
        boolean socket = false;

        /**
         * String não é um tipo primitivo, é uma reference type
         */

        String name = "Vítor";
        String game = "The Witcher 3";
        String movie = "Jogador N°1";

        System.out.println("O melhor jogo existente é o " + game + ".");
        System.out.println("Casting Result: " + castingExample);
        System.out.println(movie);
    }
}
