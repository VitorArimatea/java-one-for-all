package academy.arimatea.javaoneforall.javacore.Oexception.exception.test;

import academy.arimatea.javaoneforall.javacore.Oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner keyboard = new Scanner(System.in);

        String usernameDB = "Vítor";
        String passwordDB = "123";

        System.out.println("Username: ");
        String usernameTyped = keyboard.nextLine();
        System.out.println("Password: ");
        String passwordTyped = keyboard.nextLine();

        if (!usernameDB.equals(usernameTyped) | !passwordDB.equals(passwordTyped)) {
            throw new InvalidLoginException("Username or password invalid");
        }

        System.out.println("User logged if success!");
    }
}
