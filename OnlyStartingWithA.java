import java.util.*;
class OnlyStartingWithA
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
				System.out.println("The String is only Start with A is = ");
			for (String a : s)
			{
				if (a.charAt(0)=='A'||a.charAt(0)=='a')
			System.out.println(a);

			}

	}
}