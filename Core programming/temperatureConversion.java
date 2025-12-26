package Coreprogramming;
import java.util.Scanner;

public class temperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        scanner.close();
    }
}
