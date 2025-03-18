package academy.arimatea.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        // \d = all digits
        // \D = not is a digit
        // \s = whitespaces: \n \t \f
        // \S = not is a whitespace
        // \w = A-ZA-Z, digits, _
        // \W = inverse of \w

        String regex = "\\W";
        String text = "j\t 1@3#14_y";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Positions found: ");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }
    }
}
