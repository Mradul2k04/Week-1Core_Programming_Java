import java.util.*;
public class SplitWordsWithLength {
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
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(lengthWithoutLength(words[i]));
        }
        return result;
    }
    public static void display(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
    public static void main(String[] args) {
        String input = sc.nextLine();
        String[] words = splitCustom(input);
        String[][] result = wordsWithLength(words);
        display(result);
    }
}
