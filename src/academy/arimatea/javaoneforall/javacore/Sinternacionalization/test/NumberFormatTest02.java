package academy.arimatea.javaoneforall.javacore.Sinternacionalization.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeEN = new Locale("en", "US");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormatArray = new NumberFormat[4];
        numberFormatArray[0] = NumberFormat.getInstance();
        numberFormatArray[1] = NumberFormat.getCurrencyInstance(localeIT);
        numberFormatArray[2] = NumberFormat.getCurrencyInstance(localeEN);
        numberFormatArray[3] = NumberFormat.getCurrencyInstance(localeJP);

        double value = 100_000.3210;

        for (NumberFormat numberFormat : numberFormatArray) {
            System.out.println("Maximum fraction digits: " + numberFormat.getMaximumFractionDigits());
            System.out.println("Maximum integer digits: " + numberFormat.getMaximumIntegerDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "$1000.3210";

        try {
            System.out.println(numberFormatArray[2].parse(stringValue));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
