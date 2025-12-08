import java.util.*;
class FindMinElemtOccuredFromArray
{
	public static void main(String args[])
	{
		int n,i,min=Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array :");
		n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements :");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		int count=0;
		for(i=0;i<arr.length;i++)
		{
			if(min==arr[i])
			{
				count++;
			}
		}
		System.out.println("Max Element is : "+min+ " occred in array :"+count);
	}
}