import java.util.*;
public class SubstringCompare {
    static Scanner sc = new Scanner(System.in);
    public static String substringCustom(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String input = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String customSub = substringCustom(input, start, end);
        String builtInSub = input.substring(start, end);
        boolean isEqual = compareStrings(customSub, builtInSub);
        System.out.println(customSub);
        System.out.println(builtInSub);
        System.out.println(isEqual);
    }
}
