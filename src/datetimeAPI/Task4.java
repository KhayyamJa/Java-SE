package datetimeAPI;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task4 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();

        int minimumYear = calendar.getActualMinimum(Calendar.YEAR);
        int minimumMonth = calendar.getActualMinimum(Calendar.MONTH);
        int minimumWeek = calendar.getActualMinimum(Calendar.WEEK_OF_MONTH);
        int minimumDate = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);

        System.out.println("Minimum Year : " + minimumYear);
        System.out.println("Minimum Month : " + minimumMonth);
        System.out.println("Minimum Week : " + minimumWeek);
        System.out.println("Minimum Date : " + minimumDate);

    }
}
