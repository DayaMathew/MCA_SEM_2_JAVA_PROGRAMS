// Printer Queue Simulation without Synchronization

class Printer
{
    void print(String document)
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
    }
}

// Thread class
class User extends Thread
{
    Printer p;
    String doc;

    User(Printer p, String d)
    {
        this.p = p;
        doc = d;
    }

    public void run()
    {
        p.print(doc);
    }
}

public class pm30
{
    public static void main(String args[])
    {
        Printer printer = new Printer();

        User u1 = new User(printer, "Document A");
        User u2 = new User(printer, "Document B");

        u1.start();
        u2.start();
    }
}
