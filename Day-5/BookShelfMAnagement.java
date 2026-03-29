import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return title.equals(b.title) && author.equals(b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

class BookShelf {
    HashMap<String, LinkedList<Book>> genreCatalog = new HashMap<>();
    HashSet<Book> allBooks = new HashSet<>();

    void addBook(String genre, Book book) {
        if (allBooks.contains(book)) {
            System.out.println("Duplicate book not added: " + book);
            return;
        }
        genreCatalog.putIfAbsent(genre, new LinkedList<>());
        genreCatalog.get(genre).add(book);
        allBooks.add(book);
        System.out.println("Book added: " + book + " under genre: " + genre);
    }

    void borrowBook(String genre, Book book) {
        LinkedList<Book> list = genreCatalog.get(genre);
        if (list != null && list.remove(book)) {
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not found or already borrowed: " + book);
        }
    }

    void returnBook(String genre, Book book) {
        if (!allBooks.contains(book)) {
            System.out.println("Invalid return: Book doesn't belong to this library");
            return;
        }
        genreCatalog.putIfAbsent(genre, new LinkedList<>());
        genreCatalog.get(genre).add(book);
        System.out.println("Book returned: " + book);
    }

    void displayCatalog() {
        for (String genre : genreCatalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : genreCatalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}

public class BookShelfMAnagement {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b4 = new Book("1984", "George Orwell");

        shelf.addBook("Fiction", b1);
        shelf.addBook("Classic", b2);
        shelf.addBook("Fantasy", b3);
        shelf.addBook("Fiction", b4);

        shelf.displayCatalog();

        shelf.borrowBook("Fiction", b1);
        shelf.returnBook("Fiction", b1);

        shelf.displayCatalog();
    }
}
