package academy.arimatea.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2026-07-13");
        LocalTime time = LocalTime.parse("08:30:40");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(date);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
