package academy.arimatea.javaoneforall.javacore.Sinternacionalization.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        String s1 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = now.format(DateTimeFormatter.ISO_DATE);
        String s3 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse = LocalDate.parse("20250313", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-03-13", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-03-13", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now2 = LocalDateTime.now();

        String s4 = now2.format(DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime parse4 = LocalDateTime.parse("2025-03-13T14:04:45.323878800");

        System.out.println(s4);
        System.out.println(parse4);

        //dd/MM/yyyy BR
        //MM/dd/yyyy US
        //yyyy/MM/dd JP
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("13/03/2025", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterCA = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CANADA);
        String formatCA = LocalDate.now().format(formatterCA);
        System.out.println(formatCA);
    }
}
