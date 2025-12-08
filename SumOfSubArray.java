import java.util.*;
class SumOfSubArray
{
	public static void main(String args[])
	{
		int n,i,k=4,TotalArrayCount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array :");
		n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements :");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<=arr.length-3;i++)
		{
			int j=i,sum=0,count=0;
			while(count!=3)
			{
				sum=sum+arr[j];
				count++;j++;
			}
			if(sum==k)
			{
				TotalArrayCount++;
			}
		}
		System.out.println("The Sum of Sub array whose sum is 7 is "+TotalArrayCount);
	}
}