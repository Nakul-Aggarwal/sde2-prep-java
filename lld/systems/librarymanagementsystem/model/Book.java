package lld.systems.librarymanagementsystem.model;

import java.util.List;
import java.util.Optional;

public class Book {

    private String bookId;
    private String title;
    private String author;
    private List<BookCopy> copies;

    public Book (
            String bookId,
            String title,
            String author,
            List<BookCopy> copies) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public Optional<BookCopy> getAvailableCopy() {

        for(BookCopy copy : copies) {
            if(copy.isAvailable()) {
                return Optional.of(copy);
            }
        }

        return Optional.empty();
    }

    public String getbookId() {
        return this.bookId;
    }

    public String getTitle() {
        return this.title;
    }
}
