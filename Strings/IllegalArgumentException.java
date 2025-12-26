import java.util.*;
public class IllegalArgumentException {
    static Scanner sc = new Scanner(System.in);
    static String inputString;
    public static void generateException() {
        String sub = inputString.substring(5, 2);
        System.out.println(sub);
    }
    public static void handleException() {
        try {
            String sub = inputString.substring(5, 2);
            System.out.println(sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }
    public static void main(String[] args) {
        inputString = sc.nextLine();
        generateException();
        handleException();
    }
}
