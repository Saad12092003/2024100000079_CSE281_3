public class main {

    public static void main(String[] args) {

        Account accounts[] = new Account[2];

        accounts[0] = new SavingsAccount(101, 5000, "Saad");
        accounts[1] = new CurrentAccount(102, 8000, "Rahim");

        for (Account acc : accounts) {

            acc.displayInfo();
            System.out.println(" ");
            System.out.println(" ");

        }

        BankAccount b1 = new SavingsAccount(103, 1000, "Karim");

        b1.deposit(2000);
        b1.deposit(1000.75);

        System.out.println("------Custom Exception using try-catch Error handling------");
        System.out.println(" ");

        try {

            b1.withdraw(7000.00);

        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : " +  e.getMessage());
        }

        catch (InsufficientFundsException e) {

            System.out.println("InsufficientFundsException : " + e.getMessage());
        }

        finally {

            System.out.println("Current balance  : " + b1.getBalance());

        }

    }
}

