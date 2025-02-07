
package academy.arimatea.maratonajava.introducao;

public class Aula05ConditionalStatements04 {
    public static void main(String[] args) {
        double annualSalary = 800.0;
        double firstTax = 0.09699999999999999;
        double secondTax = 0.3735;
        double thirdTax = 0.495;
        double firstTaxResult = annualSalary * firstTax;
        double secondTaxResult = annualSalary * secondTax;
        double thirdTaxResult = annualSalary * thirdTax;
        String tax;
        if (annualSalary > (double) 1200.0F && annualSalary <= (double) 34712.0F) {
            tax = "Your tax rate is 9.70%: \n" + firstTaxResult;
        } else if (annualSalary >= (double) 34713.0F && annualSalary <= (double) 68507.0F) {
            tax = "Your tax rate is 37.35%: \n" + secondTaxResult;
        } else if (annualSalary >= (double) 68508.0F) {
            tax = "Your tax rate is 49.50%: \n" + thirdTaxResult;
        } else {
            tax = "You don't have to pay taxes";
        }

        System.out.println(tax);
    }
}

