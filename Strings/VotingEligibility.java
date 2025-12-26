import java.util.*;
public class VotingEligibility {
    static Scanner sc = new Scanner(System.in);
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + r.nextInt(90);
        }
        return ages;
    }
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else if (ages[i] >= 18) result[i][1] = "true";
            else result[i][1] = "false";
        }
        return result;
    }
    public static void display(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int[] ages = generateAges(n);
        String[][] eligibility = checkEligibility(ages);
        display(eligibility);
    }
}
