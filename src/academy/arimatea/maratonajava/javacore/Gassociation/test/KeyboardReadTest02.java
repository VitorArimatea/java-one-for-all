package academy.arimatea.maratonajava.javacore.Gassociation.test;

import java.util.Scanner;

public class KeyboardReadTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---- Previsão do futuro ----");
        System.out.println("Digite sim ou não e responderei sua pergunta");

        String question = input.nextLine();

        if(question.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
