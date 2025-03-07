package academy.arimatea.javaoneforall.javacore.Sinternacionalization.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String pattern = "'Brazil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Brazil 06 de março de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
