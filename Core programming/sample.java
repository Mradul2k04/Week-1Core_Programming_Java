package Coreprogramming;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the from city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the to city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from fromCity to viaCity in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from viaCity to toCity in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken from fromCity to viaCity in minutes: ");
        double timeFromToVia = scanner.nextDouble();

        System.out.print("Enter the time taken from viaCity to toCity in minutes: ");
        double timeViaToFinalCity = scanner.nextDouble();

        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.6; // Convert miles to km
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTime + " minutes");

        scanner.close();
    }
}
