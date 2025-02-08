package academy.arimatea.maratonajava.introducao;

public class Aula06RepetitionStructures03 {
    public static void main(String[] args) {

        int maxValue = 50;

        for (int i = 0; i <= maxValue; i++) {
            System.out.println(i);
            if (i == 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
