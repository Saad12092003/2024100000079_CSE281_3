abstract class Account {

    private int accountNumber;
    private double balance;

    protected Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    protected int getAccountNumber() {
        return accountNumber;
    }

    protected double getBalance() {
        return balance;
    }


    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
