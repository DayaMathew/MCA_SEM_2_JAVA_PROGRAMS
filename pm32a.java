class Buffer
{
    int data;
    boolean available = false;

    // Producer puts data
    synchronized void produce(int value)
    {
        while(available)
        {
            try { wait(); } catch(Exception e) {}
        }

        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    // Consumer takes data
    synchronized int consume()
    {
        while(!available)
        {
            try { wait(); } catch(Exception e) {}
        }

        System.out.println("Consumed: " + data);
        available = false;
        notify();
        return data;
    }
}

// Producer Thread
class Producer extends Thread
{
    Buffer b;

    Producer(Buffer b)
    {
        this.b = b;
    }

    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            b.produce(i);
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

// Consumer Thread
class Consumer extends Thread
{
    Buffer b;

    Consumer(Buffer b)
    {
        this.b = b;
    }

    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            b.consume();
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}

public class pm32a
{
    public static void main(String args[])
    {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}
