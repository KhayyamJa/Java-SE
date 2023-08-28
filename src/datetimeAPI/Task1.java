package datetimeAPI;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task1 {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.AUGUST);
        calendar.set(Calendar.DAY_OF_MONTH, 28);
        calendar.set(Calendar.HOUR_OF_DAY, 13);
        calendar.set(Calendar.MINUTE, 9);
        calendar.set(Calendar.SECOND, 45);


        Date date = calendar.getTime();
        System.out.println(date);
    }
}
