import java.util.*;
public class CharArrayCompare {
    static Scanner sc = new Scanner(System.in);
    public static char[] toCharArrayCustom(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String input = sc.next();
        char[] customArr = toCharArrayCustom(input);
        char[] builtInArr = input.toCharArray();
        boolean isEqual = compareCharArrays(customArr, builtInArr);
        System.out.println(isEqual);
    }
}
