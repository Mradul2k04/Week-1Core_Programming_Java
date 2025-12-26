import java.util.*;
public class TrimString {
    static Scanner sc = new Scanner(System.in);
    public static int[] trimIndices(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }
    public static String substringCustom(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
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
        String input = sc.nextLine();
        int[] indices = trimIndices(input);
        String customTrimmed = substringCustom(input, indices[0], indices[1]);
        String builtInTrimmed = input.trim();
        boolean isEqual = compareStrings(customTrimmed, builtInTrimmed);
        System.out.println(customTrimmed);
        System.out.println(builtInTrimmed);
        System.out.println(isEqual);
    }
}
