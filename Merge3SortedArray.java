import java.util.*;
class Merge3SortedArray
{
	public static void main(String args[])
	{
		int n1,n2,n3,i,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of First Array :");
		n1=sc.nextInt();
		int[] ar1= new int[n1];
		System.out.println("Enter first Array elemts:");
		for(i=0;i<ar1.length;i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter size of second Array :");
		n2=sc.nextInt();
		int[] ar2= new int[n2];
		System.out.println("Enter second Array elemts:");
		for(i=0;i<ar2.length;i++)
		{
			ar2[i]=sc.nextInt();
		}
		System.out.println("Enter size of third Array :");
		n3=sc.nextInt();
		int[] ar3= new int[n3];
		System.out.println("Enter third Array elemts:");
		for(i=0;i<ar3.length;i++)
		{
			ar3[i]=sc.nextInt();
		}
		
		int[] res = new int[ar1.length+ar2.length+ar3.length];
		while(k<res.length)
		{
			if(i<ar1.length)
			{
				res[k]=ar1[i];
				k++;
			}
			if(i<ar2.length)
			{
				res[k]=ar1[i];
				k++;
			}
			if(i<ar3.length)
			{
				res[k]=ar1[i];
				k++;
			}
			i++;
		}
	}
}