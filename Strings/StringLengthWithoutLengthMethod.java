import java.util.*;
public class StringLengthWithoutLengthMethod {
    static Scanner sc = new Scanner(System.in);
    public static int lengthWithoutLength(String s) {
        int count = 0;
        try {
            while(true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        String input = sc.next();
        int customLength = lengthWithoutLength(input);
        int builtInLength = input.length();
        System.out.println(customLength);
        System.out.println(builtInLength);
    }
}
