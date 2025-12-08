import java.util.*;
class FindMaxElemtFromArray
{
	public static void main(String args[])
	{
		int n,i,max=Integer.MIN_VALUE;
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
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int count=0;
		for(i=0;i<arr.length;i++)
		{
			if(max==arr[i])
			{
				count++;
			}
		}
		System.out.println("Max Element is : "+max+ " occred in array :"+count);
	}
}