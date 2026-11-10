package Basics.PracticeQuestions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PrintTime {
    static void main() {

        //Using Date Class
        Date d = new Date();
        System.out.println(d.getHours() + ":"+d.getMinutes() + ":"+d.getSeconds());


        //Using Calendar Class
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":"+c.get(Calendar.MINUTE) + ":"+c.get(Calendar.SECOND));

        //Using TimeAPI
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
