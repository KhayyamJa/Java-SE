package datetimeAPI;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));
    }
}
