import java.util.*;
class FindGreatestAndSmallestDigit
{

	public static void main(String [] args2)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		long n= in.nextLong();
		long digit,sum=0,f=9;

		while(n!=0)
		{
			digit=n%10;
			n=n/10;
			if(digit>sum)
			{
			sum=digit;

			}
			if(digit<f)
			{
				f=digit;

			}


		}
		System.out.println("The Greates Digit are = "+sum);
		System.out.println("The Smallest Digit are = "+f);

	}
}