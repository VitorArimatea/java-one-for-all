package academy.arimatea.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(2004, 2, 28);
        LocalDate now = LocalDate.now();

        Period myBirthUntilNow = Period.between(birth, now);
        System.out.println(myBirthUntilNow);

        LocalDate nowAfterThreeYears = LocalDate.now().plusYears(3).plusDays(2);

        Period p1 = Period.between(now, nowAfterThreeYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofMonths(4);
        Period p4 = Period.ofWeeks(70);
        Period p5 = Period.ofYears(1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(p4.getMonths());
        System.out.println(Period.between(now, now.plusDays(p4.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(p4.getDays()), ChronoUnit.MONTHS));
    }
}
