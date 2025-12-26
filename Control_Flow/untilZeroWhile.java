import java.util.Scanner;

public class untilZeroWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            value = input.nextDouble();

            if (value == 0) {
                break;
            }
            total += value;
        }

        System.out.println("The total sum is: " + total);
        input.close();
    }
}