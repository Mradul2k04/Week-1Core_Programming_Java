import java.util.*;
public class LowercaseCompare {
    static Scanner sc = new Scanner(System.in);
    public static String convertToLowercaseCustom(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String input = sc.nextLine();
        String customLower = convertToLowercaseCustom(input);
        String builtInLower = input.toLowerCase();
        boolean isEqual = compareStrings(customLower, builtInLower);
        System.out.println(customLower);
        System.out.println(builtInLower);
        System.out.println(isEqual);
    }
}
