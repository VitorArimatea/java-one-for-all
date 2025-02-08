package academy.arimatea.maratonajava.introducao;

public class Aula06RepetitionStructures05 {
    public static void main(String[] args) {

        double totalValue = 30000;

        for (int installment = (int) totalValue; installment >= 1; installment--) {
            double installmentPrice = totalValue / installment;

            if (installmentPrice < 1000) {
                continue;
            }

            System.out.println("Installment: " + installment + " R$ " + installmentPrice);
        }
    }
}
