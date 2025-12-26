package Coreprogramming;
import java.util.Scanner;

public class ConvertWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        double weightKg = weightPounds / 2.2;

        System.out.println("The weight of the person in pounds is " + weightPounds + " and in kg is " + weightKg);

        scanner.close();
    }
}
