<<<<<<< HEAD
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter yyyy-mm-dd: ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate, format);

        LocalDate add = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = add.minusWeeks(3);

        System.out.println(date.format(format));
        System.out.println(add.format(format));
        System.out.println(finalDate.format(format));
    }
=======
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter yyyy-mm-dd: ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate, format);

        LocalDate add = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = add.minusWeeks(3);

        System.out.println(date.format(format));
        System.out.println(add.format(format));
        System.out.println(finalDate.format(format));
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}