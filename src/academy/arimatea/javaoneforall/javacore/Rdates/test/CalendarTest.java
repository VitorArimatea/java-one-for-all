package academy.arimatea.javaoneforall.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week");
        }

        System.out.println("Day of the week: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of the month: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of the year: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.roll(Calendar.HOUR, 16);

        Date date = calendar.getTime();
        System.out.println(date);
    }

}
