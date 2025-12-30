import java.util.*;
class printNonRepeatedEle
{
	public static void main(String rgs[])
	{
		Scanner scan = new Scanner(System.in);
		int count=1;
		System.out.println("Array Size :");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Elements :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print(arr[arr.length-1]);
	}
}