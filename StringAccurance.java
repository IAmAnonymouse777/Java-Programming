import java.util.*;
class StringAccurance
{
	public static void main(String [] args)
	{
		int i,count=0;
		char a,y;

	Scanner in = new Scanner (System.in);
	System.out.println("Enter the string ");
	String x= in.nextLine();
	System.out.println("Enter charecter you want to check accurance");
	y= in.next().charAt(0);
	for(i=0;i<=x.length()-1;i++)
	{
		a=x.charAt(i);
		if(a==y)
			count++;

	}
	System.out.println("The "+y+" Accure total = "+count);
	}
}