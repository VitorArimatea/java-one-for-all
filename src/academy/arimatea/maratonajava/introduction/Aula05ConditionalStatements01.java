package academy.arimatea.maratonajava.introduction;

public class Aula05ConditionalStatements01 {
    public static void main(String[] args) {
        int age = 17;
        boolean youCanBuyBeer = age >= 18;

        if (youCanBuyBeer != false) {
            System.out.println("You can buy beer");
        } else {
            System.out.println("You're not old enough for this.");
        }

        if (!youCanBuyBeer) {
            System.out.println("IF SOLTO ATIVADO");
        }
    }
}
