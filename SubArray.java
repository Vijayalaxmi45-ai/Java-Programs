import java.util.*;
class SubArray
{
	public static void main(String args[])
	{
		int n,i;
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
			int j=i,count=0;
			while(count!=3)
			{
				System.out.print(arr[j]+",");
				count++;
				j++;
			}
			System.out.println();
			
		}
		
		
	}
}