import java.util.*;
class FindAccurance
{

	public static void main(String [] args2)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		long n= in.nextLong();
		System.out.println("Enter the The digit to check their accurance");
		long d= in.nextLong();
		long digit,f=0;
		while(n!=0)
		{
			digit=n%10;
			n=n/10;
			if (d==digit)
			{
				f++;
			}
		}
		System.out.println("The "+d+"accurance in program are = "+f+" Times");
	}

}