import java.util.Scanner;
public class prgm14{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter"+n+ "elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element to search");
		int key = sc.nextInt();
		Boolean found=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Element found at position"+(i+1));
found=true;
break;
}
}
if(!found)
{
System.out.println("element not found in the array");
}
}
}
		
		