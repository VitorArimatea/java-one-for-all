package academy.arimatea.javaoneforall.javacore.Sinternacionalization.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwitzerland = new Locale("fr", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");

        DateFormat dateFormatItaly = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormatSwitzerland = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
        DateFormat dateFormatIndia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormatJapan = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat dateFormatNetherlands = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

        System.out.println(calendar.getTime());
        System.out.println("Italy: " + dateFormatItaly.format(calendar.getTime()));
        System.out.println("Switzerland: " + dateFormatSwitzerland.format(calendar.getTime()));
        System.out.println("India: " + dateFormatIndia.format(calendar.getTime()));
        System.out.println("Japan: " + dateFormatJapan.format(calendar.getTime()));
        System.out.println("Netherlands: " + dateFormatNetherlands.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayLanguage(localeNetherlands));
        System.out.println(localeItaly.getDisplayLanguage());

        Locale localeJapanFinal = Locale.JAPAN;
        Locale localeKoreaFinal = Locale.KOREA;

        System.out.println(localeJapanFinal.getDisplayCountry(localeJapanFinal));
        System.out.println(localeJapanFinal.getDisplayLanguage());
        System.out.println(localeKoreaFinal.getDisplayCountry(localeKoreaFinal));
        System.out.println(localeKoreaFinal.getDisplayLanguage());
    }
}
