import java.util.Scanner;

public class code12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        double baseInches = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double heightInches = input.nextDouble();

        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * 6.4516; // 1 square inch = 6.4516 square cm

        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");
    }
}