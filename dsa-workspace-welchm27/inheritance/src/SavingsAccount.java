public class SavingsAccount extends BankAccount{

    private double interestRate;
    private double balance;

    public SavingsAccount(double rate){
        // will automatically call on the default BankAccount constructor
        interestRate = rate;
    }

    public SavingsAccount(double rate, double initialAmount){
        super(initialAmount);
        interestRate = rate;
    }

    public void addPeriodicInterest(){
        double interest = getBalance() * interestRate / 100.0;

        deposit(interest);
    }

}   // END OF CLASS