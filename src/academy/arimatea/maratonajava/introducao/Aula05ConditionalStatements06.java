package academy.arimatea.maratonajava.introducao;

public class Aula05ConditionalStatements06 {
    public static void main(String[] args) {
        // Given a value from 1 to 7, print whether it is a weekday or a weekend day.
        // Considering 1 as Sunday

        byte day = 8;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend Day");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }
}
