import java.util.*;
class StringSepLine
{
	public static void main(String [] args)
	{
		int i;
		char y;
	Scanner in = new Scanner (System.in);
	System.out.println("Enter the string ");
	String x= in.nextLine();
			for(i=0;i<=x.length()-1;i++)
			{
				y=x.charAt(i);
				System.out.println("\t\t"+y);

			}

	}

}