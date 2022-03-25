import java.util.*;
class MaxNum
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the two num");
		int a = in.nextInt();
		int b = in.nextInt();
		if(a<b)
		System.out.println("The "+b+" is greater than "+a);
		if(a>b)
		System.out.println("The "+a+" is greater than "+b);
		if(a==b)
			System.out.println("The "+a+" is Equal to "+b);



	}
}