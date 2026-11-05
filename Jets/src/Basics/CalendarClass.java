package Basics;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass {
    static void main() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.MILLISECOND));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTimeZone());

        System.out.println("\nPrint New Time Zone\n");

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MILLISECOND));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
    }
}
