import java.util.*;
class sumOfSubArray2
{
	public static void main(String rgs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array Size :");
		int n = scan.nextInt();
		int count=0;
		int j;
		int[] arr = new int[n];
		System.out.println("Enter Elements :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter size :");
		int size = scan.nextInt();
		for(int i=0;i<=arr.length-size; i++)
		{
			int sum=0;
			for(j=i;j<i+size;i++)
			{
				sum=sum+arr[j];
			}
			if(sum==7)
			{
				for(j=i;j<size+i;j++)
				{
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}				
		}
	}
}