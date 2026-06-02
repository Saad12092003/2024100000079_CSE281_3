

class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, double balance, String holderName) {
        super(accountNumber, balance, holderName);
    }
    
    void calculateInterest() {

        double interest = getBalance() * 0.02;

        System.out.println("Calculated Interest (2%): " + interest);
    }


    void displayInfo() {

        System.out.println("Account Type: Current Account");

        super.displayInfo();
    }
}