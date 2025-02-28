package academy.arimatea.javaoneforall.introduction;

public class Aula04Operators {
    public static void main (String[] args) {
        int number1 = 20;
        int number2 = 3;

        int sum = number1 + number2;
        System.out.println("The result of the sum is: " + sum);
        int sub = number1 - number2;
        System.out.println("The result of the subtraction is: " + sub);
        int mult = number1 * number2;
        System.out.println("The result of the multiplication is: " + mult);
        int div = number1 / number2;
        System.out.println("The result of the division is: " + div);

        int res = number1 % number2;
        System.out.println("The result of the remainder is: " + res);

        System.out.println("---------------------------------------------------------");

        // < > <= >= != ==
        boolean isFifteenGreaterThirty = 15 > 30;
        boolean isFifteenSmallerThirty = 15 < 30;
        boolean isFifteenSmallerOrEqualThirty = 15 <= 30;
        boolean isFifteenGreaterOrEqualThirty = 15 >= 30;
        boolean isFifteenEqualThirty = 15 == 30;
        boolean isFifteenDifferentThirty = 15 != 30;

        System.out.println("Fifteen is greater than thirty: " + isFifteenGreaterThirty);
        System.out.println("Fifteen is smaller than thirty: " + isFifteenSmallerThirty);
        System.out.println("Fifteen is smaller or equal to thirty: " + isFifteenSmallerOrEqualThirty);
        System.out.println("Fifteen is greater than or equal to thirty: " + isFifteenGreaterOrEqualThirty);
        System.out.println("Fifteen is equal to thirty: " + isFifteenEqualThirty);
        System.out.println("Fifteen is different from thirty: " + isFifteenDifferentThirty);

        System.out.println("------------------LOGIC OPERATORS-----------------------");

        // && (AND) || (OR) ! (NOT)

        int age = 20;
        double pay = 2000;

        boolean withinTheLawSmallerThirty = age < 30 || pay >= 3381;
        boolean withinTheLawGreaterThirty = age >= 30 && pay >= 4612;

        System.out.println("The payment is within the law for people under 30: " + withinTheLawSmallerThirty);
        System.out.println("The payment is within the law for people 30 or older: " + withinTheLawGreaterThirty);

        double currentAccountBalance = 100.70;
        double savingsAccountBalance = 10000;
        float playstationValue = 3500F;

        if (currentAccountBalance >= playstationValue || savingsAccountBalance >= playstationValue) {
            System.out.println("I can buy the PS5!");
        } else {
            System.out.println("Not this time, let's keep working!");
        }

        // = += -= *= /= %=

        double bonus = 1700;
        bonus *= 2.01;
        bonus -= 500;
        bonus += 1700;
        bonus /= 2;
        bonus += 1700;
        bonus *= 2.01;
        bonus %= 2;
        System.out.println(bonus);

        int count = 0;
        System.out.println(count);
        count += 1;
        System.out.println(count);

        count++;
        System.out.println(count);
        ++count;
        --count;
        count--;
        System.out.println(count);
        System.out.println(++count);

    }
}
