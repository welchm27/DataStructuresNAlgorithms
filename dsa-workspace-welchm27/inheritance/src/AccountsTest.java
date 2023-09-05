class AccountsTest {

    public static void main(String[] args) {
        BankAccount collegeFund = new BankAccount(100);

        BankAccount savings = new BankAccount();

//        System.out.println("$" + collegeFund.getBalance());
//
//        savings.deposit(50);
//        collegeFund.withdraw(50);
//
//        System.out.println("The balance in CollegeFund is $" + collegeFund.getBalance() + "\n"
//         + "The balance in Savings is $" + savings.getBalance());
//        System.out.println();
//
//
//        collegeFund.transfer(savings,20);
//        System.out.println("The balance in CollegeFund is $" + collegeFund.getBalance() + "\n"
//                + "The balance in Savings is $" + savings.getBalance());
//        System.out.println();

        CheckingAccount Checking1 = new CheckingAccount(100);

        System.out.println("Checking1 " + Checking1);
        System.out.println();

        SavingsAccount VacationSavings = new SavingsAccount(10, 500);
        System.out.println("Vacation Savings " + VacationSavings);
        System.out.println();

        VacationSavings.transfer(Checking1, 300);
        System.out.println("Checking1 " + Checking1);
        System.out.println("VacationSavings " + VacationSavings);

    } // end of main
}   // END OF CLASS