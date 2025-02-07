
package academy.arimatea.maratonajava.introducao;

public class Aula05ConditionalStatements04 {
    public static void main(String[] args) {
        double annualSalary = 100000;

        double firstTax = 9.70 / 100;
        double secondTax = 37.35 / 100;
        double thirdTax = 49.50 / 100;

        double firstTaxResult = annualSalary * firstTax;
        double secondTaxResult = annualSalary * secondTax;
        double thirdTaxResult = annualSalary * thirdTax;

        String tax;

        if (annualSalary > 1200 && annualSalary <= 34712.0) {
            tax = "Your tax rate is 9.70%: \n" + firstTaxResult;
        } else if (annualSalary >= 34713.0 && annualSalary <= 68507.0) {
            tax = "Your tax rate is 37.35%: \n" + secondTaxResult;
        } else if (annualSalary >= 68508.0) {
            tax = "Your tax rate is 49.50%: \n" + thirdTaxResult;
        } else {
            tax = "You don't have to pay taxes";
        }

        System.out.println(tax);
    }
}

