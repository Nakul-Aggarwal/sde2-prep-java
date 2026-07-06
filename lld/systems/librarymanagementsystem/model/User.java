package lld.systems.librarymanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userId;
    private String name;
    private Role role;
    private List<BookCopy> borrowedBooks;

    public User(
            String userId,
            String name,
            Role role) {

        this.userId = userId;
        this.name = name;
        this.role = role;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserId() {
        return this.userId;
    }

    public int getNumberOfBooksBorrowed() {
        return borrowedBooks.size();
    }

    public void addBorrowedBook(BookCopy book) {
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(BookCopy book) {
        borrowedBooks.remove(book);
    }

    public List<BookCopy> getBorrowedBooks() {
        return List.copyOf(this.borrowedBooks);
    }

}
