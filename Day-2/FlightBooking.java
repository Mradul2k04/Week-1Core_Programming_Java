import java.util.Scanner;

public class FlightBooking {
    static String[] boarding = {"New Delhi","Mumbai","Kolkata","Chandigarh","Dehradoon"};
    static String[] destination = {"Banglore","Dubai","Chennai","Palwal","Meerut"};
    static FlightBooking[] bookings = new FlightBooking[100];
    static int bookingCount = 0;

    String passengername;
    String passengerboard;
    String passengerdestination;

    FlightBooking(String passengername, String passengerboard, String passengerdestination){
        this.passengername = passengername;
        this.passengerboard = passengerboard;
        this.passengerdestination = passengerdestination;
    }

    public static void searchFlights(String searchTerm) {
        String lowerSearch = searchTerm.toLowerCase();
        boolean found = false;
        System.out.println("Matching flights:");
        for (String b : boarding) {
            if (b.toLowerCase().contains(lowerSearch)) {
                System.out.println("Boarding: " + b);
                found = true;
            }
        }
        for (String d : destination) {
            if (d.toLowerCase().contains(lowerSearch)) {
                System.out.println("Destination: " + d);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found matching: " + searchTerm);
        }
    }

    public static boolean bookFlight(String passengerName, String boardingLoc, String destinationLoc) {
        boolean validBoarding = false;
        boolean validDestination = false;
        for (String b : boarding) {
            if (b.equalsIgnoreCase(boardingLoc)) {
                validBoarding = true;
                break;
            }
        }
        for (String d : destination) {
            if (d.equalsIgnoreCase(destinationLoc)) {
                validDestination = true;
                break;
            }
        }
        if (validBoarding && validDestination) {
            if (bookingCount < bookings.length) {
                bookings[bookingCount++] = new FlightBooking(passengerName, boardingLoc, destinationLoc);
                return true;
            } else {
                System.out.println("Booking limit reached.");
                return false;
            }
        }
        return false;
    }

    public static void displayBookings() {
        if (bookingCount == 0) {
            System.out.println("No bookings found.");
            return;
        }
        for (int i = 0; i < bookingCount; i++) {
            FlightBooking fb = bookings[i];
            System.out.println("Passenger: " + fb.passengername + ", Boarding: " + fb.passengerboard + ", Destination: " + fb.passengerdestination);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Flight Booking System");
        while (true) {
            System.out.println("1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = 0;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
                continue;
            }
            if (choice == 1) {
                System.out.print("Enter search term: ");
                String term = sc.nextLine();
                searchFlights(term);
            } else if (choice == 2) {
                System.out.print("Enter passenger name: ");
                String name = sc.nextLine();
                System.out.print("Enter boarding location: ");
                String board = sc.nextLine();
                System.out.print("Enter destination: ");
                String dest = sc.nextLine();
                if (bookFlight(name, board, dest)) {
                    System.out.println("Booking successful.");
                } else {
                    System.out.println("Invalid boarding or destination location.");
                }
            } else if (choice == 3) {
                displayBookings();
            } else if (choice == 4) {
                System.out.println("Exiting. Thank you!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}