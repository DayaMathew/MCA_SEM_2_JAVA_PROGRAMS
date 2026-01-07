class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Child Thread: " + i);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

public class pm26
{
    public static void main(String args[])
    {
        MyRunnable r = new MyRunnable();   // Create Runnable object
        Thread t = new Thread(r);          // Create Thread object
        t.start();                         // Start the thread

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Main Thread: " + i);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
