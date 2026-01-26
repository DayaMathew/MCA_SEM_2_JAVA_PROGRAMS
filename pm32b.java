class ReadWrite
{
    int readers = 0;

    synchronized void read(String name)
    {
        readers++;
        System.out.println(name + " started reading");

        try { Thread.sleep(1000); } catch(Exception e) {}

        System.out.println(name + " finished reading");
        readers--;

        if(readers == 0)
            notifyAll();
    }

    synchronized void write(String name)
    {
        while(readers > 0)
        {
            try { wait(); } catch(Exception e) {}
        }

        System.out.println(name + " started writing");
        try { Thread.sleep(1000); } catch(Exception e) {}
        System.out.println(name + " finished writing");
    }
}

// Reader Thread
class Reader extends Thread
{
    ReadWrite rw;
    String name;

    Reader(ReadWrite rw, String name)
    {
        this.rw = rw;
        this.name = name;
    }

    public void run()
    {
        rw.read(name);
    }
}

// Writer Thread
class Writer extends Thread
{
    ReadWrite rw;
    String name;

    Writer(ReadWrite rw, String name)
    {
        this.rw = rw;
        this.name = name;
    }

    public void run()
    {
        rw.write(name);
    }
}

public class pm32b
{
    public static void main(String args[])
    {
        ReadWrite rw = new ReadWrite();

        Reader r1 = new Reader(rw, "Reader 1");
        Reader r2 = new Reader(rw, "Reader 2");
        Writer w1 = new Writer(rw, "Writer 1");

        r1.start();
        r2.start();
        w1.start();
    }
}
