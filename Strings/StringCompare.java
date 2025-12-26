import java.util.*;
public class StringCompare {
    static Scanner sc = new Scanner(System.in);
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = sc.next();
        String s2 = sc.next();
        boolean customResult = compareStrings(s1, s2);
        boolean builtInResult = s1.equals(s2);
        System.out.println(customResult);
        System.out.println(builtInResult);
    }
}
