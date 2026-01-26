import java.util.Scanner;

// Thread class
class SearchThread extends Thread
{
    int arr[];
    int start, end;
    int key;
    boolean found = false;

    SearchThread(int a[], int s, int e, int k)
    {
        arr = a;
        start = s;
        end = e;
        key = k;
    }

    public void run()
    {
        for(int i = start; i < end; i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Element " + key + " found at index " + i +
                        " by " + Thread.currentThread().getName());
                found = true;
                break;
            }
        }
    }
}

public class pm28
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter element to search");
        int key = sc.nextInt();

        int numThreads = n / 5;
        if(numThreads == 0)
            numThreads = 1;     // minimum one thread

        int size = n / numThreads;

        SearchThread threads[] = new SearchThread[numThreads];

        int start = 0;

        for(int i = 0; i < numThreads; i++)
        {
            int end = (i == numThreads - 1) ? n : start + size;

            threads[i] = new SearchThread(arr, start, end, key);
            threads[i].start();
            start = end;
        }

        // wait for all threads to finish
        for(int i = 0; i < numThreads; i++)
        {
            try
            {
                threads[i].join();
            }
            catch(Exception e) { }
        }

        System.out.println("Search completed");
    }
}
