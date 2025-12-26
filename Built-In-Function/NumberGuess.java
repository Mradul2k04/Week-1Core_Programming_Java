<<<<<<< HEAD
import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static int generateGuess(int min, int max, Random ranGen) {
        return ranGen.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random ranGen = new Random();
        int lowLimit = 1;
        int upLimit = 100;
        int guess;
        String fb;

        while (true) {
            guess = generateGuess(lowLimit, upLimit, ranGen);
            System.out.println("Is your number " + guess + "? (Enter: high, low, correct)");
            fb = sc.nextLine().trim().toLowerCase();

            if (fb.equals("correct")) {
                System.out.println("Yay! The computer guessed your number: " + guess);
                break;
            } else if (fb.equals("high")) {
                upLimit = guess - 1;
            } else if (fb.equals("low")) {
                lowLimit = guess + 1;
            } else {
                System.out.println("Please enter 'high', 'low', or 'correct'.");
            }

            if (lowLimit > upLimit) {
                System.out.println("It seems there was a mistake in the feedback. Exiting.");
                break;
            }
        }
    }
=======
import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static int generateGuess(int min, int max, Random ranGen) {
        return ranGen.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random ranGen = new Random();
        int lowLimit = 1;
        int upLimit = 100;
        int guess;
        String fb;

        while (true) {
            guess = generateGuess(lowLimit, upLimit, ranGen);
            System.out.println("Is your number " + guess + "? (Enter: high, low, correct)");
            fb = sc.nextLine().trim().toLowerCase();

            if (fb.equals("correct")) {
                System.out.println("Yay! The computer guessed your number: " + guess);
                break;
            } else if (fb.equals("high")) {
                upLimit = guess - 1;
            } else if (fb.equals("low")) {
                lowLimit = guess + 1;
            } else {
                System.out.println("Please enter 'high', 'low', or 'correct'.");
            }

            if (lowLimit > upLimit) {
                System.out.println("It seems there was a mistake in the feedback. Exiting.");
                break;
            }
        }
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}