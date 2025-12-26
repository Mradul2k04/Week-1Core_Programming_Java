package level2;
import java.util.Scanner;
public class code8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter double a: "); // Prompt the user to enter the first double value
        double da = input.nextDouble();     // Read the first double value from user input
        System.out.print("Enter double b: "); // Prompt the user to enter the second double value
        double db = input.nextDouble();    // Read the second double value from user input
        System.out.print("Enter double c: "); // Prompt the user to enter the third double value
        double dc = input.nextDouble();   // Read the third double value from user input
        double dop1 = da + db * dc; // Calculate the result of da + db * dc
        double dop2 = da * db + dc;     // Calculate the result of da * db + dc
        double dop3 = da % db + dc; // Calculate the result of da % db + dc
        System.out.println("The results of Double Operations are " + dop1 + ", " + dop2 + ", and " + dop3); // Output the results of the double operations
    }
    
}
