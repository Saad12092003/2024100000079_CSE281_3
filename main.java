public class main {
    public static void main(String[] args) {

        Account accounts[] = new Account[2];

        accounts[0] = new SavingsAccount(101, 5000, "Saad");
        accounts[1] = new CurrentAccount(102, 8000, "Rahim");

        System.out.println("-----Runtime-Polymorphism----");

        for (Account acc : accounts) {

            acc.displayInfo();
            System.out.println(" ");
      

        }

        BankAccount b1 = new SavingsAccount(103, 1000, "Karim");

     System.out.println("-----Compile-time polymorphism.----");

        b1.deposit(2000);
         b1.deposit(1000.75);
         System.out.println("Successfully deposite : "+ b1.getBalance());

          System.out.println(" ");

        System.out.println("------try-catch-finally block------");

        try {

            b1.withdraw(7000.00);

        }
        catch (InsufficientFundsException e) {

            System.out.println("InsufficientFundsException : " + e.getMessage());
        }

        finally {

            System.out.println("Current balance  : " + b1.getBalance());

        }
         System.out.println(" ");

          System.out.println("------multi-catch block------");

          try
          {
            int x=100/0;

            b1.withdraw(7000);
          }

          catch (ArithmeticException   e) {

              System.out.println("Exception : Can not divide by zero");
          }

          catch(InsufficientFundsException e)
          {
                 System.out.println("InsufficientFundsException : " + e.getMessage());
          }

    }
}

