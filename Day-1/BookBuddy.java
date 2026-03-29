import java.util.ArrayList;
import java.util.Collections;

public class BookBuddy {
    private ArrayList<String> books;

    public BookBuddy() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(title + " - " + author);
    }

    public void sortBooksAlphabetically() {
        Collections.sort(books, (a, b) -> {
            String titleA = a.substring(0, a.indexOf(" - "));
            String titleB = b.substring(0, b.indexOf(" - "));
            return titleA.compareToIgnoreCase(titleB);
        });
    }

    public String[] searchByAuthor(String author) {
        ArrayList<String> results = new ArrayList<>();
        for (String book : books) {
            int sepIndex = book.indexOf(" - ");
            if (sepIndex != -1) {
                String bookAuthor = book.substring(sepIndex + 3);
                if (bookAuthor.equalsIgnoreCase(author)) {
                    results.add(book);
                }
            }
        }
        return results.toArray(new String[0]);
    }

    public String[] getBooksArray() {
        return books.toArray(new String[0]);
    }

    public static void main(String[] args) {
        BookBuddy buddy = new BookBuddy();
        buddy.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        buddy.addBook("To Kill a Mockingbird", "Harper Lee");
        buddy.addBook("1984", "George Orwell");
        buddy.addBook("Animal Farm", "George Orwell");

        System.out.println("Books before sorting:");
        for (String book : buddy.getBooksArray()) {
            System.out.println(book);
        }

        buddy.sortBooksAlphabetically();
        System.out.println("\nBooks after sorting alphabetically:");
        for (String book : buddy.getBooksArray()) {
            System.out.println(book);
        }

        String authorToSearch = "George Orwell";
        System.out.println("\nBooks by " + authorToSearch + ":");
        String[] booksByAuthor = buddy.searchByAuthor(authorToSearch);
        for (String book : booksByAuthor) {
            System.out.println(book);
        }
    }
}