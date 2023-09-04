package datetimeAPI;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task3 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();

        int maximumYear = calendar.getActualMaximum(Calendar.YEAR);
        int maximumMonth = calendar.getActualMaximum(Calendar.MONTH) + 1;
        int maximumWeek = calendar.getActualMaximum(Calendar.WEEK_OF_MONTH);
        int maximumDate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Maximum Year : " + maximumYear);
        System.out.println("Maximum Month : " + maximumMonth);
        System.out.println("Maximum Week : " + maximumWeek);
        System.out.println("Maximum Date : " + maximumDate);
    }
}
