public class CheckingAccount extends BankAccount{

    // Note that balance is inherited but not directly accessible
    private static final int FREE_TRANSACTION = 3;

    private static final double TRANSACTION_FEE = 0.50;

    private int transactionCount;

    public CheckingAccount(){
        super();  // bank account default constructor
        transactionCount = 0;
//        System.out.println("CheckingAccount!");
    }

    public CheckingAccount(double initialAmount){
        super(initialAmount);
        transactionCount = 0;
    }

    public void deposit(double amount){
        super.deposit(amount);
        transactionCount++;
    }

    public void withdraw(double amount){
        super.withdraw(amount);
        transactionCount++;
    }

    public void deductFees(){
        if(transactionCount > FREE_TRANSACTION){
            double fee = TRANSACTION_FEE *(transactionCount - FREE_TRANSACTION);

            super.withdraw(fee);
        }
        transactionCount = 0;  // start over because new time period
    }



}   // END OF CLASS