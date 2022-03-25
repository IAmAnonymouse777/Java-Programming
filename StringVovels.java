import java.util.*;
class StringVovels
{
	public static void main (String [] args)
	{

	Scanner in = new Scanner (System.in);
	System.out.println("Enter the string");
	String n= in.nextLine();

	int i;
	int y=0;
	char ch;
	for(i=0;i<n.length();i++)
	{
		ch=n.charAt(i);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		y++;

	}
	System.out.println("The total Vovels in the string is = "+y);
	}


}