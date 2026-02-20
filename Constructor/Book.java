public class Book {
    String title;
    String author;
    double price;
    boolean availability;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.availability = true;
    }

    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void borrow() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Book1 availability: " + book1.availability);
        book1.borrow();
        System.out.println("Book1 availability after borrow: " + book1.availability);

        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99, true);
        System.out.println("Book2 availability: " + book2.availability);
        book2.borrow();
        System.out.println("Book2 availability after borrow: " + book2.availability);
    }
}
