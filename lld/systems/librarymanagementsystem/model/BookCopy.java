package lld.systems.librarymanagementsystem.model;

public class BookCopy {
    
    private String copyId;
    private BookStatus bookStatus;

    public BookCopy(String copyId) {
        this.copyId = copyId;
        this.bookStatus = BookStatus.AVAILABLE;
    }

    public String getCopyId() {
        return copyId;
    }

    public boolean isAvailable() {
        return bookStatus == BookStatus.AVAILABLE;
    }

    public void borrow() {

        if(!isAvailable()) {
            throw new IllegalStateException("Book already borrowed");
        }

        bookStatus = BookStatus.BORROWED;
    }

    public void returnBook() {
        bookStatus = BookStatus.AVAILABLE;
    }
}
