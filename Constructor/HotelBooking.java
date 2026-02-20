public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "";
        this.roomType = "";
        this.nights = 0;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking: " + defaultBooking.guestName + ", " + defaultBooking.roomType + ", " + defaultBooking.nights);

        HotelBooking paramBooking = new HotelBooking("John Doe", "Suite", 3);
        System.out.println("Param Booking: " + paramBooking.guestName + ", " + paramBooking.roomType + ", " + paramBooking.nights);

        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("Copy Booking: " + copyBooking.guestName + ", " + copyBooking.roomType + ", " + copyBooking.nights);
    }
}
