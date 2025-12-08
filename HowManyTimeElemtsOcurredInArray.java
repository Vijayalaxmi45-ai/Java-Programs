import java.util.*;
class HowManyTimeElemtsOcurredInArray
{
	public static void main(String args[])
	{
		int n,key,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sixe of array :");
		n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements :");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Key For Checking elment :");
		key=sc.nextInt();
		int count =0;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				count ++;
			}
		}
		if(count ==0)
		{
			System.out.println("Element Not Found!!");
		}
		System.out.println("elment occred "+ count+ "Times.");
	}
}