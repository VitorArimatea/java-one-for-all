package academy.arimatea.javaoneforall.introduction;

public class Aula05ConditionalStatements03 {
    public static void main(String[] args) {
        // Donate if salary > 5000
        double salary = 7700.20;
        String donateMessage = "I'm going donate $500 to DevDojo";
        String noDonateMessage = "I'm don't have enough money";
        // Ternary Operator condition ? true : false
        String result = salary > 5000 ? donateMessage : noDonateMessage;

        System.out.println(result);

    }
}
