package academy.arimatea.javaoneforall.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {

        // ? zero or one
        // * zero or more
        // + uma ou mais
        // {n,m} n to m
        // ()
        // | o(v|o)o ovo | oco
        // $
        // . 1.3, 133, 1@3, 1A3 Joker Char

        String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        String text = "vitor@gmail.com, marina@teste.com, 1]~eç, !$, teste@test, unkno2w@mail.com.br " +
                "uppercase@GMAIL.COM";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(Arrays.toString(text.split(",")));
        System.out.println("Email válido: " + "unkno2w@mail.com.br".matches(regex));
        System.out.println(text.split(",")[1].trim());

        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found: ");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + "\n ");
        }

    }
}
