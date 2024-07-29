package week1.Data_Structure_and_Algorithms.LibraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (size == books.length) {
            System.out.println("Library is full, cannot add more books.");
            return;
        }
        books[size++] = book;
        Arrays.sort(books, 0, size, Comparator.comparing(Book::getTitle));
    }

    // Linear search method to find books by title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary search method to find books by title
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
