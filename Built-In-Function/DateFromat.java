<<<<<<< HEAD
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFromat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + today.format(f1));
        System.out.println("Format 2: " + today.format(f2));
        System.out.println("Format 3: " + today.format(f3));
    }
=======
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFromat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + today.format(f1));
        System.out.println("Format 2: " + today.format(f2));
        System.out.println("Format 3: " + today.format(f3));
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}