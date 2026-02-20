public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    static class EBook extends Book {
        public EBook(String ISBN, String title, String author) {
            super(ISBN, title, author);
        }

        public void displayDetails() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("123-456-789", "Java Programming", "John Doe");
        EBook eb1 = new EBook("987-654-321", "Advanced Java", "Jane Smith");

        System.out.println("Author: " + b1.getAuthor());
        b1.setAuthor("John Smith");
        System.out.println("Updated Author: " + b1.getAuthor());

        eb1.displayDetails();
    }
}
