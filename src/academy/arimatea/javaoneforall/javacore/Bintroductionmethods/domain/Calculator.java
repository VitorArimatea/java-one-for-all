package academy.arimatea.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println("Sum result: " + 15 + 10);
    }

    public void subTwoNumbers() {
        int sub = 15 - 10;

        System.out.println("Sub result: " + sub);
    }

    public void multTwoNumbers(int n1, float n2) {
        System.out.println("Mult result: " + n1 * n2);
    }

    public double divTwoNumbers(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }

        return n1 / n2;
    }

    public void printDivTwoNumbers(int n1, int n2) {
        if (n2 != 0) {
            int div = n1 / n2;
            System.out.println(div);
            return;
        }
        System.out.println("Division by 0 does not exist");
    }

    public void changeTwoNumbers(int num1, int num2) {
        num1 = 70;
        num2 = 40;

        System.out.println("Inside changeTwoNumbers: " + num1 + ", " + num2);
    }

    public void arraySum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
