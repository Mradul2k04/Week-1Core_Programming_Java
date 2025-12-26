import java.util.Scanner;
public class code2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle (in cm): ");
        double baseCm = input.nextDouble();
        System.out.print("Enter height of the triangle (in cm): ");
        double heightCm = input.nextDouble();
        double areaCm = 0.5 * baseCm * heightCm;
        double areaInches = areaCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
        }
}
