import java.util.*;
class sumOfSubArray
{
	public static void main(String rgs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array Size :");
		int n = scan.nextInt();
		int count=0;
		int[] arr = new int[n];
		System.out.println("Enter Elements :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter Size Of Sub Array :");
		int size = scan.nextInt();
		for(int i=0; i<=arr.length-size;i++)
		{
			int sum=0;
			for(int j=i;j<i+size;j++)
			{
				sum=sum+arr[j];
			}
			if(sum==7)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}