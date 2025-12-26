import java.util.*;
public class ShortestLongestWords {
    static Scanner sc = new Scanner(System.in);
    public static String[] splitCustom(String s) {
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words[index++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = s.substring(start);
        return words;
    }
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
    public static int[] findShortestLongest(String[] words) {
        int shortest = lengthWithoutLength(words[0]);
        int longest = shortest;
        for (int i = 1; i < words.length; i++) {
            int len = lengthWithoutLength(words[i]);
            if (len < shortest) shortest = len;
            if (len > longest) longest = len;
        }
        return new int[]{shortest, longest};
    }
    public static void main(String[] args) {
        String input = sc.nextLine();
        String[] words = splitCustom(input);
        int[] result = findShortestLongest(words);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
