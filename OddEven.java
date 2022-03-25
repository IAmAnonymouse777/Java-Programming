import java.util.*;
class OddEven
{
	public static void main (String [] args )
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter The Num ");
		int n= in.nextInt();
		if(n%2==0)
		System.out.println("The "+n+" is Even ");
		else
		System.out.println("The "+n+" is odd");


	}
}