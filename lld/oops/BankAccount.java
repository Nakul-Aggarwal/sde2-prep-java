public class BankAccount {
    // TODO: Implement a simple bank account demonstrating OOP

    // Pseudo code:
    // - Fields: private String accountNumber, private double balance, private String ownerName
    // - Constructor: BankAccount(String accountNumber, String ownerName)
    // - deposit(double amount): balance += amount
    // - withdraw(double amount): if balance >= amount, balance -= amount, else throw exception
    // - getBalance(): return balance
    // - getAccountNumber(), getOwnerName()

    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    // TODO: Implement methods
}