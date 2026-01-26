// ATM Simulation using Synchronization

class BankAccount
{
    private int balance = 1000;   // Initial balance

    // synchronized deposit method
    synchronized void deposit(int amount)
    {
        System.out.println(Thread.currentThread().getName() +
                " is depositing " + amount);

        balance = balance + amount;

        System.out.println("Balance after deposit: " + balance);
    }

    // synchronized withdraw method
    synchronized void withdraw(int amount)
    {
        System.out.println(Thread.currentThread().getName() +
                " is withdrawing " + amount);

        if(balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Withdrawal successful. Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance for " +
                    Thread.currentThread().getName());
        }
    }

    void displayBalance()
    {
        System.out.println("Final Balance = " + balance);
    }
}

// ATM User Thread
class ATMUser extends Thread
{
    BankAccount acc;
    int amount;
    boolean isDeposit;

    ATMUser(BankAccount acc, int amt, boolean dep)
    {
        this.acc = acc;
        amount = amt;
        isDeposit = dep;
    }

    public void run()
    {
        if(isDeposit)
            acc.deposit(amount);
        else
            acc.withdraw(amount);
    }
}

public class pm35
{
    public static void main(String args[])
    {
        BankAccount acc = new BankAccount();

        ATMUser user1 = new ATMUser(acc, 500, true);   // deposit
        ATMUser user2 = new ATMUser(acc, 700, false);  // withdraw
        ATMUser user3 = new ATMUser(acc, 400, false);  // withdraw

        user1.setName("User-1");
        user2.setName("User-2");
        user3.setName("User-3");

        user1.start();
        user2.start();
        user3.start();
    }
}
