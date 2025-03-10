package academy.arimatea.javaoneforall.javacore.Rdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterThreeYears = LocalDateTime.now().plusYears(3).plusMinutes(5);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus8Hours = LocalTime.now().minusHours(8);

        Duration duration = Duration.between(now, nowAfterThreeYears);
        Duration duration2 = Duration.between(timeNow, timeMinus8Hours);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(180));
        System.out.println(duration);
        System.out.println(duration2);
        System.out.println(duration3);

        Duration durationDays = Duration.ofDays(22);
        Duration durationMinutes = Duration.ofMinutes(17);
        Duration durationOf = Duration.of(40, ChronoUnit.HOURS);

        System.out.println(durationDays);
        System.out.println(durationMinutes);
        System.out.println(durationOf);
    }
}
