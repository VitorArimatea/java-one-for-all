package academy.arimatea.maratonajava.introduction;

public class Aula05ConditionalStatements02 {
    public static void main(String[] args) {
        // age < 15 children’s category;
        // age >= 15 && age < 18 youth category;
        // age >= 18 adult category;

        int age = 0;
        String category;

        if (age < 15 && age >= 0) {
            category = "You are in the children’s category";
        } else if (age >= 15 && age < 18) {
            category = "You are in the teen category";
        } else if (age >= 18) {
            category = "You are in the adult category";
        } else {
            category = "Invalid age";
        }
        System.out.println(category);

    }
}
