package lld.systems.librarymanagementsystem.service;

import java.util.List;

import lld.systems.librarymanagementsystem.exception.BookNotFoundException;
import lld.systems.librarymanagementsystem.exception.BorrowLimitExceededException;
import lld.systems.librarymanagementsystem.exception.BookUnavailaibleException;
import lld.systems.librarymanagementsystem.exception.UserNotFoundException;
import lld.systems.librarymanagementsystem.model.Book;
import lld.systems.librarymanagementsystem.model.BookCopy;
import lld.systems.librarymanagementsystem.model.BookStatus;
import lld.systems.librarymanagementsystem.model.User;
import lld.systems.librarymanagementsystem.repository.BookRepository;
import lld.systems.librarymanagementsystem.repository.UserRepository;

public class LibraryService {

    private BookRepository bookRepository;
    private UserRepository userRepository;

    public LibraryService(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void removeBook(String bookId) {
        bookRepository.delete(bookId);
    }

    public List<Book> searchBook(String title) {
        return bookRepository.search(title);
    }

    public BookCopy borrowBook(String userId, String bookId) {

        User user = userRepository.getUser(userId)
                .orElseThrow(
                    () -> new UserNotFoundException(userId));

        Book book = bookRepository.getBook(bookId)
                .orElseThrow(
                    () -> new BookNotFoundException(bookId));

        if(user.getNumberOfBooksBorrowed() >= 5) {
            throw new BorrowLimitExceededException(userId);
        }

        BookCopy copy = book.getAvailableCopy()
                .orElseThrow(
                    () -> new BookUnavailaibleException(bookId));

        copy.borrow();
        user.addBorrowedBook(copy);

        return copy;
    }

    public void returnBook(String userId, String copyId) {

        User user =
            userRepository.getUser(userId)
                .orElseThrow(
                    () -> new UserNotFoundException(userId));

        BookCopy copyToReturn = null;

        for(BookCopy copy : user.getBorrowedBooks()) {
            if(copy.getCopyId().equals(copyId)) {
                copyToReturn = copy;
                break;
            }
        }

        if(copyToReturn == null) {
            throw new RuntimeException(
                "Copy not borrowed by user"
            );
        }

        copyToReturn.returnBook();
        user.removeBorrowedBook(copyToReturn);
    }

    public List<BookCopy> getBorrowedBooks(String userId) {

        User user = userRepository.getUser(userId)
                    .orElseThrow(
                        () -> new UserNotFoundException(userId));

        return user.getBorrowedBooks();
    }
}
