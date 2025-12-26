import java.util.*;
public class NullPointerException {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }
    public static void main(String[] args) {
        generateException();
        handleException();
    }
}
