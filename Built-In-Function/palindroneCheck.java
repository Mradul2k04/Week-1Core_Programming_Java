<<<<<<< HEAD
import java.util.Scanner;

public class palindroneCheck {
    public static void main(String[] args) {
        String userText = input();
        boolean isPalindrome = checkPalindrome(userText);
        showResult(userText, isPalindrome);
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :- ");
        String text = sc.nextLine();
        return text;
    }

    public static boolean checkPalindrome(String text) {
        String cleanText = text.toLowerCase().trim();
        int l = 0;
        int r = cleanText.length() - 1;
        while (l < r) {
            if (cleanText.charAt(l) != cleanText.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void showResult(String text, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
=======
import java.util.Scanner;

public class palindroneCheck {
    public static void main(String[] args) {
        String userText = input();
        boolean isPalindrome = checkPalindrome(userText);
        showResult(userText, isPalindrome);
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :- ");
        String text = sc.nextLine();
        return text;
    }

    public static boolean checkPalindrome(String text) {
        String cleanText = text.toLowerCase().trim();
        int l = 0;
        int r = cleanText.length() - 1;
        while (l < r) {
            if (cleanText.charAt(l) != cleanText.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void showResult(String text, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}