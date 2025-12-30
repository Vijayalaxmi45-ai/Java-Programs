import java.util.*;
class largestReaptingNo
{
	public static void main(String rgs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array Size :");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Elements :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=arr.length-2;i>0;i--)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
}