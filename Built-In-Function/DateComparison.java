<<<<<<< HEAD
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter yyyy-MM-dd : ");
        String firstInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput, format);

        System.out.print("Enter yyyy-MM-dd : ");
        String second = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(second, format);

        if (firstDate.isBefore(secondDate)) {
            System.out.println("before");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("after ");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("same");
        }
    }
=======
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter yyyy-MM-dd : ");
        String firstInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput, format);

        System.out.print("Enter yyyy-MM-dd : ");
        String second = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(second, format);

        if (firstDate.isBefore(secondDate)) {
            System.out.println("before");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("after ");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("same");
        }
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}