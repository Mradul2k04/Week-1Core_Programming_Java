<<<<<<< HEAD
import java.util.Scanner;

public class BasicCalci {
    public static double input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return sc.nextDouble();
    }
    public static int choiceInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Double firstNumber = input();
        Double secondNumber = input();


        int choice = choiceInput();

        double result = 0;
        boolean valid = true;

        if (choice == 1) {
            result = add(firstNumber, secondNumber);
        } else if (choice == 2) {
            result = subtract(firstNumber, secondNumber);
        } else if (choice == 3) {
            result = multiply(firstNumber, secondNumber);
        } else if (choice == 4) {
            result = divide(firstNumber, secondNumber);
        } else {
            System.out.println("Invalid choice.");
            valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }
=======
import java.util.Scanner;

public class BasicCalci {
    public static double input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return sc.nextDouble();
    }
    public static int choiceInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Double firstNumber = input();
        Double secondNumber = input();


        int choice = choiceInput();

        double result = 0;
        boolean valid = true;

        if (choice == 1) {
            result = add(firstNumber, secondNumber);
        } else if (choice == 2) {
            result = subtract(firstNumber, secondNumber);
        } else if (choice == 3) {
            result = multiply(firstNumber, secondNumber);
        } else if (choice == 4) {
            result = divide(firstNumber, secondNumber);
        } else {
            System.out.println("Invalid choice.");
            valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}