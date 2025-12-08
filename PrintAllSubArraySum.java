import java.util.*;
class PrintAllSubArraySum
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
		int sum=0,j=i,count=0;
		for(i=0;i<=arr.length-3;i++)
		{
			sum=sum+arr[j];
			count++;j++;
		}
		System.out.println(sum);
	}
}