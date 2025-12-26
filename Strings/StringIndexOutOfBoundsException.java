import java.util.*;
public class StringIndexOutOfBoundsException {
    static Scanner sc = new Scanner(System.in);
    static String inputString;
    public static void generateException() {
        char ch = inputString.charAt(inputString.length());
        System.out.println(ch);
    }
    public static void handleException() {
        try {
            char ch = inputString.charAt(inputString.length());
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }
    public static void main(String[] args) {
        inputString = sc.nextLine();
        generateException();
        handleException();
    }
}
