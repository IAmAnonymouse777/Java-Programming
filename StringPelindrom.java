import java.util.*;
class StringPelindrom
{
	public static void main (String [] args)
	{

	Scanner in = new Scanner (System.in);
	System.out.println("Enter the string");
	String n= in.nextLine();
	int i;
	char ch;
	String z="";
	for(i=n.length()-1;i>=0;i--)
	{
		ch=n.charAt(i);
		z=z+ch;

	}
	if(n.equals(z))
	{
	System.out.println("The String is palindrome ");
	}
	else
	System.out.println("The String is not a palindrome string ");

	}


}