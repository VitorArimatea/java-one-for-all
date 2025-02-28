package academy.arimatea.javaoneforall.javacore.Bintroductionmethods.test;

import academy.arimatea.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest  {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();
        calculator.subTwoNumbers();
        calculator.multTwoNumbers(10,3.45F);
        double divResult = calculator.divTwoNumbers(20,0);
        System.out.println(divResult);
        calculator.printDivTwoNumbers(10,5);
    }
}
