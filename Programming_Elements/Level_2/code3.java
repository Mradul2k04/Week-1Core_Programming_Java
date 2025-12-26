package level2;
import java.util.Scanner;
public class code3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter the perimeter of the square: "); // Prompt the user to enter the perimeter
        double perimeter = input.nextDouble();// Read the perimeter from user input
        double side = perimeter / 4;// Calculate the length of one side of the square
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);// Output the length of the side and the perimeter
        }
}
