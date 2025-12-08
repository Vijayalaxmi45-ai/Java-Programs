//applicatble only when u enter numbers from 1 to...
// 1 3 5 9 2 8 10 4 11 6 elements
//array size 10
import java.util.*;
class MissingElemtFromUnsortedArray
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
		int no=arr.length+1;
		int sum1=no*(no+1)/2;
		int sum2=0;
		for(i=0;i<arr.length;i++)
		{
			sum2=sum2+arr[i];
		}
		int missing=sum1-sum2;
		System.out.println("Missing element "+missing);
	}
}