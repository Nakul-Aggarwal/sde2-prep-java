package lld.systems.librarymanagementsystem;

import java.util.List;

import lld.systems.librarymanagementsystem.model.Book;
import lld.systems.librarymanagementsystem.model.BookCopy;
import lld.systems.librarymanagementsystem.model.Role;
import lld.systems.librarymanagementsystem.model.User;
import lld.systems.librarymanagementsystem.repository.BookRepository;
import lld.systems.librarymanagementsystem.repository.UserRepository;
import lld.systems.librarymanagementsystem.service.LibraryService;

public class Main {
    
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        UserRepository userRepository = new UserRepository();

        LibraryService libraryService = new LibraryService(bookRepository, userRepository);

        BookCopy copy1 = new BookCopy("COPY_1");
        BookCopy copy2 = new BookCopy("COPY_2");
        BookCopy copy3 = new BookCopy("COPY_3");

        Book harryPotter = new Book("BOOK_1", "Harry Potter", "J K Rowling", List.of(copy1, copy2, copy3));
        libraryService.addBook(harryPotter);

        User nakul = new User("USER_1", "Nakul", Role.MEMBER);
        userRepository.save(nakul);

        BookCopy assignedCopy = libraryService.borrowBook("USER_1","BOOK_1");
        System.out.println(assignedCopy.getCopyId()); // Expected COPY_1

        List<BookCopy> borrowedBooks = libraryService.getBorrowedBooks("USER_1"); // Expected COPY_1
        for(BookCopy copy : borrowedBooks) {
            System.out.println(copy.getCopyId());
        }

        libraryService.returnBook("USER_1",assignedCopy.getCopyId());
        borrowedBooks = libraryService.getBorrowedBooks("USER_1"); // Expected emptyList
        for(BookCopy copy : borrowedBooks) {
            System.out.println(copy.getCopyId());
        }
    }
}
