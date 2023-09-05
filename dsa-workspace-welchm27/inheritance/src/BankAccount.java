public class BankAccount {
    // data members
    private double balance;  // hold the amount in the account

    // Default constructor
    public BankAccount(){
        balance = 0.0;}

    // constructor with an initial balance
    public BankAccount(double initialAmount){
        balance = initialAmount;
//        System.out.println("BankAccount!");
    }

    // methods
    public void deposit(double amount){
        balance += amount;  // balance = balance + amount
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // function to transfer money from current bank account to other bank account
    public void transfer(BankAccount other, double amount){
        withdraw(amount);
        other.deposit(amount);
    }

    public String toString(){
        return "Account balance: $" + balance;
    }

}   // END OF CLASS