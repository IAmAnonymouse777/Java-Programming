import java.util.*;
class Facto
{
	public static void main(String [] args)
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the num for factorial of it ");
		int n= in.nextInt();
		System.out.println("\n\n\n ");
		int i=1,fact=1;

		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("The factoria is = "+fact);


	}
}