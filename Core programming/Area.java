package Coreprogramming;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = scanner.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double cmToInch = 2.54;
        double baseInch = baseCm / cmToInch;
        double heightInch = heightCm / cmToInch;
        double areaIn2 = 0.5 * baseInch * heightInch;

        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);

        scanner.close();
    }
}
