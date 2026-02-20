public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental() {
        this.customerName = "";
        this.carModel = "";
        this.rentalDays = 0;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost(double dailyRate) {
        return rentalDays * dailyRate;
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental: " + defaultRental.customerName + ", " + defaultRental.carModel + ", " + defaultRental.rentalDays);

        CarRental paramRental = new CarRental("Jane Smith", "Toyota Camry", 5);
        System.out.println("Param Rental: " + paramRental.customerName + ", " + paramRental.carModel + ", " + paramRental.rentalDays);
        System.out.println("Total Cost: " + paramRental.calculateTotalCost(40.0));
    }
}
