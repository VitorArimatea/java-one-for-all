package academy.arimatea.javaoneforall.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);

        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");

        OffsetDateTime offsetDateTime = now.atOffset(offSetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offSetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offSetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(now);
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
