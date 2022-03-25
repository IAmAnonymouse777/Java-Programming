import java.util.*;
class DivisibleFactorOfNum
{
	public static void main (String [] args )
	{
		int i;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter The Num ");
		int n= in.nextInt();
		System.out.println("The all Divisible factor of Num as follows");
		for(i=1;i<=n;i++)
		if(n%i==0)
		System.out.println(i);
	}
}