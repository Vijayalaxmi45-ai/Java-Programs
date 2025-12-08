import java.util.*;
class ReturnTotalNoOfDigitWithoutLoop
{
	public static void main(String args[])
	{
		long n,count=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextLong();
		/*1st way
		String s=""+n;;
		System.out.println(s.length());
		*/
		
		String s =Long.toString(n);
		System.out.println(s.length());
		
		/*3rd way
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);*/
	}
}