class Printer
{
    // synchronized method
    synchronized void print(String document)
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(document + " printing page " + i);
            try
            {
                Thread.sleep(300);
            }
            catch(Exception e) { }
        }
        System.out.println(document + " printing completed\n");
    }
}

// User thread
class User extends Thread
{
    Printer p;
    String doc;

    User(Printer p, String doc)
    {
        this.p = p;
        this.doc = doc;
    }

    public void run()
    {
        p.print(doc);
    }
}

public class pm31
{
    public static void main(String args[])
    {
        Printer printer = new Printer();

        User u1 = new User(printer, "Document A");
        User u2 = new User(printer, "Document B");
        User u3 = new User(printer, "Document C");

        u1.start();
        u2.start();
        u3.start();
    }
}
