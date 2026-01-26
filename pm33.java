// Bank Account without Synchronization

class BankAccount
{
    int balance = 1000;   // initial balance

    void deposit(int amount)
    {
        int temp = balance;
        temp = temp + amount;
        try { Thread.sleep(300); } catch(Exception e) {}
        balance = temp;
        System.out.println("Deposited: " + amount + " | Balance = " + balance);
    }

    void withdraw(int amount)
    {
        int temp = balance;
        temp = temp - amount;
        try { Thread.sleep(300); } catch(Exception e) {}
        balance = temp;
        System.out.println("Withdrawn: " + amount + " | Balance = " + balance);
    }
}

// Deposit Thread
class DepositThread extends Thread
{
    BankAccount acc;

    DepositThread(BankAccount a)
    {
        acc = a;
    }

    public void run()
    {
        acc.deposit(500);
    }
}

// Withdraw Thread
class WithdrawThread extends Thread
{
    BankAccount acc;

    WithdrawThread(BankAccount a)
    {
        acc = a;
    }

    public void run()
    {
        acc.withdraw(300);
    }
}

public class pm33
{
    public static void main(String args[])
    {
        BankAccount acc = new BankAccount();

        DepositThread d = new DepositThread(acc);
        WithdrawThread w = new WithdrawThread(acc);

        d.start();
        w.start();
    }
}
