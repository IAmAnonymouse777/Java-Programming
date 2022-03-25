import java.util.*;
class StringSepreatUsingsubString
{
	public static void main(String [] args)
	{
		int a;
		int i;
		int b=0;
		String c="";
	Scanner in = new Scanner (System.in);
	System.out.println("Enter the email address");
	String x= in.nextLine();
	a=x.indexOf('@');
	b=x.indexOf('.');
	System.out.println(a);
	 c= x.substring(0,a);
		System.out.println("user_name	: "+c);
		c=x.substring(a+1,b);
		System.out.println("Company_name	: "+c);
		c=x.substring(b+1,x.length());
		System.out.println("Domain_name	: "+c);
	}




}