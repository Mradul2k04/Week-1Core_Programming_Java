<<<<<<< HEAD
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeAndZone {
    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current time in GMT: " + gmtTime.format(date));
        System.out.println("Current time in IST: " + istTime.format(date));
        System.out.println("Current time in PST: " + pstTime.format(date));
    }
=======
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeAndZone {
    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current time in GMT: " + gmtTime.format(date));
        System.out.println("Current time in IST: " + istTime.format(date));
        System.out.println("Current time in PST: " + pstTime.format(date));
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}