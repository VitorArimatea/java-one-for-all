package academy.arimatea.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        // [] Range [a-z A-F]

        String regex = "0[xX][0-9a-fA-F]";
        String text = "Hexadecimal number finder 0xf1f23 0x 0xfff 0X 0X379A";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Positions found: ");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }

        int hexNumber = 0xfff;
        System.out.println(hexNumber);
    }
}
