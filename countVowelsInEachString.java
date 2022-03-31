import java.util.*;
class countVowelsInEachString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		  String [] s = new String [5];
		  int i,j;
		  char ch;
		  int total=0;

		  System.out.println("Enter the "+s.length+" String");
		   for (i=0;i<s.length;i++)
		   {
			   s[i] = in.nextLine();
			}

		for (String a : s)
		{
			int count=0;
			 System.out.println("vowels in String "+a+" = ");
			for (j=0;j<a.length();j++)
			{
			 	ch=a.charAt(j);
			 	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			 	{
				 count++;

			 	}
			}
			total+=count;

			System.out.println(count);
			System.out.println("\n");
		}
		System.out.println(" The total vowels in All string is = "+total);
	}
}