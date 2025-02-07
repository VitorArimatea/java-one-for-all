package academy.arimatea.maratonajava.introducao;

public class Aula06RepetitionStructures02 {
    public static void main(String[] args) {
        // Print all even numbers from 0 to 1,000,000

        int number = 0;

        while (number < 1000000) {
            number += 2;
            System.out.println("Incorrect solution - Even number: " + number);
        }

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Better solution - Even number: " + i);
            }
        }
    }
}
