import java.util.*;
public class RockPaperScissors {
    static Scanner sc = new Scanner(System.in);
    public static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        else if (r == 1) return "paper";
        else return "scissors";
    }
    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        return "Computer";
    }
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / totalGames);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0) / totalGames);
        return stats;
    }
    public static void displayResults(String[][] results) {
        System.out.println("Game User Computer Winner");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + " " + results[i][1] + " " + results[i][2]);
        }
    }
    public static void main(String[] args) {
        int userWins = 0, compWins = 0;
        System.out.println("Enter number of games:");
        int n = sc.nextInt();
        String[][] gameResults = new String[n][3];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter user choice (rock/paper/scissors):");
            String user = sc.next();
            String comp = computerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            gameResults[i][0] = String.valueOf(i+1);
            gameResults[i][1] = user;
            gameResults[i][2] = comp;
            System.out.println("Winner: " + winner);
        }
        String[][] stats = calculateStats(userWins, compWins, n);
        System.out.println("User wins: " + userWins);
        System.out.println("Computer wins: " + compWins);
        System.out.println("Winning percentages:");
        System.out.println("User: " + stats[0][2] + "%");
        System.out.println("Computer: " + stats[1][2] + "%");
    }
}
