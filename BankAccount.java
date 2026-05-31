class BankAccount extends Account {

    private String holderName;

    public BankAccount(int accountNumber, double balance, String holderName) {

        super(accountNumber, balance);

        if (balance < 0) {
            System.out.println("Initial balance cannot be negative.");
            setBalance(0);
        }

        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    @Override
    void displayInfo() {

        super.displayInfo();

        System.out.println("Holder Name: " + holderName);
    }

    @Override
    void calculateInterest() {

        double interest = getBalance() * 0.0;

        System.out.println("Interest: " + interest);
    }


    public void deposit(int amount) {

        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }

    public void deposit(double amount) {

        if (amount > 0) {
            setBalance(getBalance() + amount);
        }
    }


    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > getBalance()) {

            throw new InsufficientFundsException("Insufficient Balance!");
        }

        setBalance(getBalance() - amount);

        System.out.println("Withdraw Successful.");
    }


}