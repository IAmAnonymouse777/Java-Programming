import java.util.*;
class PaternPrintingTRI4
{

	public static void main(String [] args2)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= in.nextInt();
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}