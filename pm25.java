class MyThread extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Child Thread: " + i);
            try
            {
                Thread.sleep(500);   // Pause for 500 milliseconds
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

public class pm25
{
    public static void main(String args[])
    {
        MyThread t = new MyThread();   // Create thread object
        t.start();                    // Start the thread

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
