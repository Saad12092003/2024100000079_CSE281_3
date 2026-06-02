class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, double balance, String holderName) {
        super(accountNumber, balance, holderName);
    }

    
    void calculateInterest() {

        double interest = getBalance() * 0.05;

        System.out.println("Calculated Interest (5%): " + interest);
    }

    
    void displayInfo() {

        System.out.println("Account Type: Savings Account");

        super.displayInfo();

    }
}
