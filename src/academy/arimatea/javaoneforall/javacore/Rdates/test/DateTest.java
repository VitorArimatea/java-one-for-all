package academy.arimatea.javaoneforall.javacore.Rdates.test;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1741201940500L); // long 100000
        date.setTime(date.getTime() + 3_600_000);

        System.out.println(date);
    }
}
