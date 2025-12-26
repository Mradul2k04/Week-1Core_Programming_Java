<<<<<<< HEAD
import java.util.*;
public class  primeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        return true;
    }
        return false;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " prime number.");
        } else {
            System.out.println(num + " not a prime number.");
        }
    }
=======
import java.util.*;
public class  primeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        return true;
    }
        return false;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " prime number.");
        } else {
            System.out.println(num + " not a prime number.");
        }
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}