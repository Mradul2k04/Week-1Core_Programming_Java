<<<<<<< HEAD
import java.util.Scanner;

public class gcdAndLcm {
    public static int  input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int firstNumber = sc.nextInt();
        return firstNumber;
    }
    public static void main(String[] args) {
        int firstNumber = input();
        int secondNumber = input();

        int gcdValue = findGcd(firstNumber, secondNumber);
        int lcmValue = findLcm(firstNumber, secondNumber);

        System.out.println("GCD "+ gcdValue);
        System.out.println("LCM "+ lcmValue);
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

     public static int findLcm(int a, int b) {
        return (a * b) / findGcd(a, b);
    }
=======
import java.util.Scanner;

public class gcdAndLcm {
    public static int  input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int firstNumber = sc.nextInt();
        return firstNumber;
    }
    public static void main(String[] args) {
        int firstNumber = input();
        int secondNumber = input();

        int gcdValue = findGcd(firstNumber, secondNumber);
        int lcmValue = findLcm(firstNumber, secondNumber);

        System.out.println("GCD "+ gcdValue);
        System.out.println("LCM "+ lcmValue);
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

     public static int findLcm(int a, int b) {
        return (a * b) / findGcd(a, b);
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}