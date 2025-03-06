package academy.arimatea.javaoneforall.javacore.Sinternacionalization.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeEN = new Locale("en", "US");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormatArray = new NumberFormat[4];
        numberFormatArray[0] = NumberFormat.getInstance(localeDefault); // NumberFormat.getInstance já retorna o default, então isso não é necessário, mas é possível
        numberFormatArray[1] = NumberFormat.getInstance(localeIT);
        numberFormatArray[2] = NumberFormat.getInstance(localeEN);
        numberFormatArray[3] = NumberFormat.getInstance(localeJP);

        double value = 100_000_000.2901;

        for (NumberFormat numberFormat : numberFormatArray) {
            System.out.println("Maximum fraction digits: " + numberFormat.getMaximumFractionDigits());
            System.out.println("Maximum integer digits: " + numberFormat.getMaximumIntegerDigits());
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "1000.3210";

        try {
            System.out.println(numberFormatArray[0].parse(stringValue));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
