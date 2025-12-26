package level2;
import java.util.Scanner;
public class code5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
       System.out.print("Enter the unit price (INR): ");// Prompt the user to enter the unit price
        double unitPrice = input.nextDouble();// Read the unit price from user input
        System.out.print("Enter the quantity: ");// Prompt the user to enter the quantity
        int quantity = input.nextInt();// Read the quantity from user input
        double totalPrice = unitPrice * quantity;// Calculate the total purchase price by multiplying unit price and quantity
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);// Output the total purchase price along with the quantity and unit price

    }
}
