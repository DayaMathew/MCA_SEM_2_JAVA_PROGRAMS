import java.util.Scanner;
public class prgm8{
		public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int diff=0;
		if (a>b){
		while(b<a)
		{
			b++;
			diff++;
		}
		}
		else
		{
			while(a<b)
			{
				a++;
				diff++;
			}
		}
   System.out.println("Difference = " + diff);
    }
}