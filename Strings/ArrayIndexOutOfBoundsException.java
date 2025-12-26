import java.util.*;
public class ArrayIndexOutOfBoundsException {
    static Scanner sc = new Scanner(System.in);
    static String[] names;
    public static void generateException() {
        String name = names[names.length];
        System.out.println(name);
    }
    public static void handleException() {
        try {
            String name = names[names.length];
            System.out.println(name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        generateException();
        handleException();
    }
}
