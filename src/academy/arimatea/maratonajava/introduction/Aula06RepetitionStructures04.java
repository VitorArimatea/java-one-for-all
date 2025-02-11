package academy.arimatea.maratonajava.introduction;

public class Aula06RepetitionStructures04 {
    public static void main(String[] args) {
        // Given the price of a car, determine in how many installments it can be paid
        // Condition installmentPrice >= 1000

        double carValue = 20000;

        for (int installment = 1; installment <= carValue; installment++) {
            double installmentPrice = carValue / installment;

            /*if (installmentPrice < 1000) {
                break;
            }*/

            if (installmentPrice >= 1000) {
                System.out.println("Installment: " + installment + " R$ " + installmentPrice);
            } else {
                break;
            }
        }
    }
}
