package datetimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now(ZoneId.of("America/New_York")));

    }
}