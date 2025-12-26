package level2;
import java.util.Scanner;
public class code6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter first integer: "); // Prompt the user to enter the first integer
        int int1 = input.nextInt(); // Read the first integer from user input
        System.out.print("Enter second integer: ");     // Prompt the user to enter the second integer
        int int2 = input.nextInt();     // Read the second integer from user input
        int quotient = int1 / int2;     // Calculate the quotient of the two integers
        int remainder = int1 % int2;    // Calculate the remainder of the two integers
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + int1 + " and " + int2); // Output the quotient and remainder along with the two integers
        }
}
