package academy.arimatea.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest06 {
    public static void main(String[] args) {

        // RegExr
        // ^ Beginning
        // [^] Negated Set

        String regex = "[^abc]+";
        String text = "vitor marina 123 asdjpf osdakwp";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found: ");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + "\n ");
        }

    }
}
