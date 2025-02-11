package academy.arimatea.maratonajava.introduction;

public class Aula05ConditionalStatements05 {
    public static void main(String[] args) {
        // Print the day of the week, considering 1 as Sunday
        byte dayOfTheWeek = 7;

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }

        char sex = 'F';

        switch (sex) {
            case 'M':
                System.out.println("Man");
                break;
            case 'F':
                System.out.println("Woman");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }

    }
}
