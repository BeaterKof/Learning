package net.learning.java.date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class Main {

    public static void main(String[] args) {
        /*
         * Getting a date in Date/Calendar/LocalDateTime
         */

        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //System.out.println(ZoneId.getAvailableZoneIds());
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.systemDefault());
        System.out.println(zdt);

        /*
         * Parsing and formatting a date.
         *
         */

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String myDateString = "2018-09-22";
        Date myDate = null;
        try {
            myDate = sdf.parse(myDateString);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(myDate);
        System.out.println(sdf.format(myDate));

        /*
         * Parsing and formatting LocalDateTIme
         *
         */

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd--H-mm-ss");
        LocalDateTime localDT = LocalDateTime.parse("2001-01-02--11-11-11", dtf);
        System.out.println(localDT);

        /*
         * Print the current date in format "15/02/2010";
         */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime ldt2 = LocalDateTime.now();
        System.out.println(ldt2.format(dtf2));


        /*
         * Print the difference of days between now and "15/02/2018" in days and hours;
         */

        DateTimeFormatter dtf_15 = DateTimeFormatter.ofPattern("dd/MM/yyyy/H");
        LocalDateTime ldt_15 = LocalDateTime.parse("16/11/2018/0", dtf_15);

        System.out.println("--------");
        Duration dur = Duration.between(ldt_15, LocalDateTime.now());
        System.out.println(dur.toHours());
        System.out.println(dur.toDays());


        /*
         * Convert 2:30 in Chicago to Bucharest time
         */

        ZonedDateTime zdt3 = LocalDateTime.of(2018, 02, 02, 2, 30, 00).atZone(ZoneId.of("America/Chicago"));
        ZonedDateTime zdt2 = zdt.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));

        System.out.println(zdt3);
        System.out.println(zdt2);
    }
}
