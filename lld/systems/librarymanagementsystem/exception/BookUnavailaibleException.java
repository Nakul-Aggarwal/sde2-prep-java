package lld.systems.librarymanagementsystem.exception;

public class BookUnavailaibleException extends RuntimeException{
    
    public BookUnavailaibleException(String bookId) {
        super("Book not available: " + bookId);
    }
}
