import java.util.*;
class checkInfoIsPresent
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		  String [] s = new String [3];
		  int i;
		  System.out.println("Enter the "+s.length+" String");
		   for (i=0;i<s.length;i++)
		   {
			   s[i] = in.nextLine();
			}
			for (String a : s)
			{
				if (a.equalsIgnoreCase("Info"))
				System.out.println("Info String is present = " +a);
				else
					System.out.println("Info String is Not Present  Sorry !!");
					break;
			}

	}
}