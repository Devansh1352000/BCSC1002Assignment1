/*  Created by IntelliJ IDEA.
 *  User: Devansh Shukla (Devansh1352000)
 *  Date: 24/08/20
 *  Time: 11:40 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] currentlyAvailableBooks;

    public Library(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }
    
    public Library() {
        this.currentlyAvailableBooks = getCurrentlyAvailableBooks();
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks;
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    @Override
    public String toString() {
        return Arrays.toString(currentlyAvailableBooks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getCurrentlyAvailableBooks(), library.getCurrentlyAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentlyAvailableBooks());
    }
}
