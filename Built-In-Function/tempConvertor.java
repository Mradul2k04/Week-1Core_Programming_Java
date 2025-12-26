<<<<<<< HEAD
import java.util.Scanner;

public class tempConvertor {
    public static Double input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double tempValue = sc.nextDouble();
        return tempValue;
    }
    public static String inputUnit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit (Celsius, Fahrenheit): ");
        String unit = sc.next().trim().toUpperCase();
        return unit;
    }
       public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        double tempValue = input();
        String targetUnit = inputUnit();

        if (targetUnit.equals("C")) {
            double celsius = toCelsius(tempValue);
            System.out.println(tempValue + "°F is " + celsius + "°C");
        } else if (targetUnit.equals("F")) {
            double fahrenheit = toFahrenheit(tempValue);
            System.out.println(tempValue + "°C is " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }
    }

 
=======
import java.util.Scanner;

public class tempConvertor {
    public static Double input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double tempValue = sc.nextDouble();
        return tempValue;
    }
    public static String inputUnit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit (Celsius, Fahrenheit): ");
        String unit = sc.next().trim().toUpperCase();
        return unit;
    }
       public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        double tempValue = input();
        String targetUnit = inputUnit();

        if (targetUnit.equals("C")) {
            double celsius = toCelsius(tempValue);
            System.out.println(tempValue + "°F is " + celsius + "°C");
        } else if (targetUnit.equals("F")) {
            double fahrenheit = toFahrenheit(tempValue);
            System.out.println(tempValue + "°C is " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }
    }

 
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}