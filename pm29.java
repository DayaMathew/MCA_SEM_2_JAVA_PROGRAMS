import java.util.Scanner;

// Thread to calculate Square
class SquareThread extends Thread
{
    int num;

    SquareThread(int n)
    {
        num = n;
    }

    public void run()
    {
        int square = num * num;
        System.out.println("Square of " + num + " = " + square);
    }
}

// Thread to calculate Cube
class CubeThread extends Thread
{
    int num;

    CubeThread(int n)
    {
        num = n;
    }

    public void run()
    {
        int cube = num * num * num;
        System.out.println("Cube of " + num + " = " + cube);
    }
}

public class pm29
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        SquareThread t1 = new SquareThread(n);
        CubeThread t2 = new CubeThread(n);

        t1.start();   // start square thread
        t2.start();   // start cube thread
    }
}
