package lld.systems.librarymanagementsystem.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import lld.systems.librarymanagementsystem.model.Book;

public class BookRepository {

    private Map<String, Book> books = new HashMap<>();
    
    public Optional<Book> getBook(String bookId) {
        return Optional.ofNullable(books.get(bookId));
    }

    public void save(Book book) {
        books.put(book.getbookId(), book);
    }

    public void delete(String bookId) {
        books.remove(bookId);
    }

    public List<Book> search(String title) {
        List<Book> result = new ArrayList<>();

        for (Book book : books.values()) {
            String bookTitle = book.getTitle();

            if(bookTitle.contains(title)) {
                result.add(book);
            }
        }

        return result;
    }

}