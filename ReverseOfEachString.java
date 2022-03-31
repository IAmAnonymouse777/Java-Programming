import java.util.*;
class ReverseOfEachString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		  String [] s = new String [5];
		  int i,j;
		  char ch;

		  System.out.println("Enter the "+s.length+" String");
		   for (i=0;i<s.length;i++)
		   {
			   s[i] = in.nextLine();
		   }

			for (String a : s)
			{
				String d ="";
				 System.out.println("Reverse of String "+a+" = ");
				for (j=a.length()-1;j>=0;j--)
				{
					ch = a.charAt(j);
					d=d+ch;

				}

						 	System.out.println(d);

		}
	}
}