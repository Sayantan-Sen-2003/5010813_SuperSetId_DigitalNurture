package week1.Data_Structure_and_Algorithms.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        // Add books
        library.addBook(new Book("B001", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("B002", "1984", "George Orwell"));
        library.addBook(new Book("B003", "The Great Gatsby", "F. Scott Fitzgerald"));

        // Linear search for a book by title
        System.out.println("\nLinear Search for '1984':");
        Book foundBook = library.linearSearchByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Binary search for a book by title
        System.out.println("\nBinary Search for '1984':");
        foundBook = library.binarySearchByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}

// output:
// Linear Search for '1984':
// Found: Book{bookId='B002', title='1984', author='George Orwell'}

// Binary Search for '1984':
// Found: Book{bookId='B002', title='1984', author='George Orwell'}