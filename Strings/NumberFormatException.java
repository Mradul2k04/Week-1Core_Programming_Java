import java.util.*;
public class NumberFormatException {
    static Scanner sc = new Scanner(System.in);
    static String text;
    public static void generateException() {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }
    public static void handleException() {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }
    public static void main(String[] args) {
        text = sc.nextLine();
        generateException();
        handleException();
    }
}
