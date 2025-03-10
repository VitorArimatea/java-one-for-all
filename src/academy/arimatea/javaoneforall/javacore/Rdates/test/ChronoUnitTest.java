package academy.arimatea.javaoneforall.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2004, Month.FEBRUARY, 28, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("------------------ My life time --------------------");
        System.out.println("Decades: " + ChronoUnit.DECADES.between(birthday, now));
        System.out.println("Years: " + ChronoUnit.YEARS.between(birthday, now));
        System.out.println("Months: " + ChronoUnit.MONTHS.between(birthday, now));
        System.out.println("Days: " + ChronoUnit.DAYS.between(birthday, now));
        System.out.println("Weeks: " + ChronoUnit.WEEKS.between(birthday, now));
        System.out.println("Hours: " + ChronoUnit.HOURS.between(birthday, now));
        System.out.println("Minutes: " + ChronoUnit.MINUTES.between(birthday, now));
        System.out.println("Seconds: " + ChronoUnit.SECONDS.between(birthday, now));
    }
}
