package chapter32;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class NewDataSample {
    public static void main(String[] args) {
        NewDataSample sample = new NewDataSample();
//        sample.printDayOfWeek();
        sample.printDayOfWeekOfLocale();
    }

    private void printDayOfWeek() {
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        Locale locale = Locale.getDefault();

        for (DayOfWeek day : dayOfWeeks) {
            System.out.print(day.getDisplayName(TextStyle.FULL, locale) + " ");
            System.out.print(day.getDisplayName(TextStyle.SHORT, locale) + " ");
            System.out.println(day.getDisplayName(TextStyle.NARROW, locale));
        }
    }

    private void printDayOfWeekOfLocale() {
        DayOfWeek day = DayOfWeek.SUNDAY;
        Locale[] locales = Locale.getAvailableLocales();

        for (Locale locale : locales) {
            System.out.print(locale.getCountry() + " ");
            System.out.print(day.getDisplayName(TextStyle.FULL, locale) + " ");
            System.out.print(day.getDisplayName(TextStyle.SHORT, locale) + " ");
            System.out.println(day.getDisplayName(TextStyle.NARROW, locale));
        }
    }
}
