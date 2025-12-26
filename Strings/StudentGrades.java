import java.util.*;
public class StudentGrades {
    static Scanner sc = new Scanner(System.in);
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + r.nextInt(90);
            scores[i][1] = 10 + r.nextInt(90);
            scores[i][2] = 10 + r.nextInt(90);
        }
        return scores;
    }
    public static double[][] calculatePercentages(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }
    public static String[] calculateGrades(double[][] percentages) {
        int n = percentages.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double p = percentages[i][2];
            if (p >= 90) grades[i] = "A";
            else if (p >= 80) grades[i] = "B";
            else if (p >= 70) grades[i] = "C";
            else if (p >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    public static void display(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Physics Chemistry Math Total Average Percentage Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + " " + scores[i][1] + " " + scores[i][2] + " " +
                (int)results[i][0] + " " + results[i][1] + " " + results[i][2] + " " + grades[i]);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] scores = generateScores(n);
        double[][] results = calculatePercentages(scores);
        String[] grades = calculateGrades(results);
        display(scores, results, grades);
    }
}
