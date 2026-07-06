package lld.systems.librarymanagementsystem.exception;

public class BorrowLimitExceededException extends RuntimeException{
    
    public BorrowLimitExceededException(String userId) {
        super("User has reached borrow limit: " + userId);
    }
}
