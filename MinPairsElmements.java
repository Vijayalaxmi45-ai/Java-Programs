import java.util.*;
class MinPairsElmements
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array :");
		n=sc.nextInt();
		int[] arr = new int[n];
		int seconsmall=arr[0],small=Integer.MAX_VALUE;
		System.out.println("Enter elements :");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				seconsmall=small;
				small=arr[i];
			}
			else if(arr[i]<seconsmall && arr[i]!=small)
			{
				seconsmall=arr[i];
			}
		}
		int diffrence = seconsmall-small;
		System.out.println("Pairs are : ( "+small + ","+seconsmall+ ") And diffrence of them is "+diffrence); 
	}
}