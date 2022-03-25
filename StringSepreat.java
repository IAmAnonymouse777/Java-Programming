import java.util.*;
class StringSepreat
{
	public static void main(String [] args)
	{
		int i;
		char y;
		char b;
		char f;

		String a="";
		String c="";
		String d="";
	Scanner in = new Scanner (System.in);
	System.out.println("Enter the email address");
	String x= in.nextLine();


		for(i=0;i<=x.indexOf('@')-1;i++)
		{
		y= x.charAt(i);
		a=a+y;
		}
		System.out.println("User_Name	: "+a);
					for(i=x.indexOf('@')+1;i<=x.indexOf('.')-1;i++)
						{
						b= x.charAt(i);
						c=c+b;
						}
					System.out.println("Company_name	: "+c);

								for(i=x.indexOf('.')+1;i<=x.length()-1;i++)
										{
										f= x.charAt(i);
										d=d+f;
										}
							System.out.println("Domain_name	: "+d);
	}

}
