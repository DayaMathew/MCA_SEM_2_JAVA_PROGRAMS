class PriorityThread extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName() +
                    " is running with priority " +
                    Thread.currentThread().getPriority());
        }
    }
}

public class pm34
{
    public static void main(String args[])
    {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
