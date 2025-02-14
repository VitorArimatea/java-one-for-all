package academy.arimatea.maratonajava.javacore.Bintroductionmethods.test;

import academy.arimatea.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] arrayNumbers = {1, 2, 3, 4, 5, 602};

        calculator.arraySum(arrayNumbers);
        calculator.sumVarArgs(10, 80, 2, 9);
    }
}
