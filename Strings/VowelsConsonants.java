import java.util.*;
public class VowelsConsonants {
    static Scanner sc = new Scanner(System.in);
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
        else if (ch >= 'a' && ch <= 'z') return "Consonant";
        else return "Not a Letter";
    }
    public static String[][] findVowelsConsonants(String s) {
        String[][] result = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            result[i][0] = String.valueOf(s.charAt(i));
            result[i][1] = checkChar(s.charAt(i));
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
        String[][] result = findVowelsConsonants(input);
        display(result);
    }
}
