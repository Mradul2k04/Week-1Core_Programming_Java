<<<<<<< HEAD
import java.util.*;
public class fibonnacigenerator {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = sc.nextInt();
        
        generateFibonacci(n);
        
    }
=======
import java.util.*;
public class fibonnacigenerator {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = sc.nextInt();
        
        generateFibonacci(n);
        
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}