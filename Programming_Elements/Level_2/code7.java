package level2;
import java.util.Scanner;
public class code7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter integer a: "); // Prompt the user to enter integer a
        int a = input.nextInt(); // Read integer a from user input
        System.out.print("Enter integer b: ");  // Prompt the user to enter integer b
        int b = input.nextInt(); // Read integer b from user input
        System.out.print("Enter integer c: ");  // Prompt the user to enter integer c
        int c = input.nextInt(); // Read integer c from user input
        int op1 = a + b * c; // Calculate the result of a + b * c
        int op2 = a * b + c; // Calculate the result of a * b + c
        int op3 = a % b + c; // Calculate the result of a % b + c
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", and " + op3); // Output the results of the integer operations

    }
}
