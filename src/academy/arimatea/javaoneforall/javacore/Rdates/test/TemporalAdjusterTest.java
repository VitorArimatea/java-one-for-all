package academy.arimatea.javaoneforall.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class GetNextBusinessDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek day = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDays = 0;

        switch (day) {
            case FRIDAY:
                addDays = 3;
                System.out.println("Weekend Day: " + day + "\nNext weekday: " +
                        day.plus(addDays));
                break;
            case SATURDAY:
                addDays = 2;
                System.out.println("Weekend Day: " + day + "\nNext weekday: " +
                        day.plus(addDays));
                break;
            case SUNDAY:
                addDays = 1;
                System.out.println("Weekend Day: " + day + "\nNext weekday: " +
                        day.plus(addDays));
                break;
            default:
                System.out.println("Dia útil: " + day);
                break;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now().plusDays(4).with(new GetNextBusinessDay());

        System.out.println(today);
        System.out.println(today.getDayOfWeek());

    }
}
