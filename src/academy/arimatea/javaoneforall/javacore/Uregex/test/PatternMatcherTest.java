package academy.arimatea.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {
         String regex = "a";
         String text = "Absolutely! Regular expressions (regex) are a powerful tool for pattern matching in strings. In Java, you can use the java.util.regex package to work with regular expressions. Here's a brief overview and some examples to get you started:";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.print("Positions found: ");

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
