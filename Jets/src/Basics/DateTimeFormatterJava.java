package Basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterJava {
    static void main() {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        DateTimeFormatter df2 =DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        String myDate = dt.format(df);
        System.out.println(myDate);

    }
}
