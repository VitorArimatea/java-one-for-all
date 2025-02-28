package academy.arimatea.javaoneforall.introduction;

public class Aula06RepetitionStructures01 {
    public static void main(String[] args) {
        // while, do while, for

        int count = -1;

        while (count <= 20) {
            System.out.println("While: " + count++);
        }

        do {
            System.out.println("Do while: " + count++);
        } while (count <= 30);

        for (int i = 0; i <= 10; i++) {
            System.out.println("For: " + i);
        }
    }
}
