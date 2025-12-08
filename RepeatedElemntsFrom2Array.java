import java.util.*;
class RepeatedElemntsFrom2Array
{
	
	public static void main(String args[])
	{
		int n1,n2,j,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of first array :");
		n1=sc.nextInt();
		System.out.println("Enter Size of second array :");
		n2=sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		System.out.println("Enter elements of first array:");
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of second array :");
		for(j=0;j<arr2.length;j++)
		{
			arr2[j]=sc.nextInt();
		}
		System.out.println("Repeated elements are :");
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				if(arr2[j]==arr1[i])
				{
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}
}