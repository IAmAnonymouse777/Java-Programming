import java.util.*;
class StringEqual
{
	public static void main(String [] args)
	{

	Scanner in = new Scanner (System.in);
	System.out.println("Enter the 1st string ");
	String x= in.nextLine();

	System.out.println("Enter the 2nd string ");
	String y= in.nextLine();

	if(x.equals(y))
	System.out.println("The Both String are Equal");
	else
	System.out.println("The Both String are Not Equal");


	}

}