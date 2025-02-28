package academy.arimatea.javaoneforall.javacore.Gassociation.test;

import java.util.Scanner;

public class KeyboardReadTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your gender, M or F: ");
        char gender = input.next().charAt(0);

        System.out.println("----------------------------------");

        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gender is: " + gender);

        input.close();
    }
}
