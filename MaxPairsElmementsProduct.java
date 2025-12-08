import java.util.*;
class MaxPairsElmementsProduct
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array :");
		n=sc.nextInt();
		int[] arr = new int[n];
		int seconlarge=arr[0],largest=Integer.MIN_VALUE;
		System.out.println("Enter elements :");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				seconlarge=largest;
				largest=arr[i];
			}
			else if(arr[i]>seconlarge && arr[i]!=largest)
			{
				seconlarge=arr[i];
			}
		}
		int product = seconlarge*largest;
		System.out.println("Pairs are : ( "+largest + ","+seconlarge+ ") And Product of them is "+product); 
	}
}