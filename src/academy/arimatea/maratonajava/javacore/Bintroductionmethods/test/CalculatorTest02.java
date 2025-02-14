package academy.arimatea.maratonajava.javacore.Bintroductionmethods.test;

import academy.arimatea.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest02 extends Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;

        calculator.changeTwoNumbers(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
