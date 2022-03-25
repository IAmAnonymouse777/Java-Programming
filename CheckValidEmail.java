
import java.util.*;

class CheckValidEmail

{

	public static void main(String [] args)
	{
		int  i;
		Scanner in= new Scanner (System.in);
		System.out.println("Enter the Email Address");
		String s= in.nextLine();
			int x= s.indexOf('@');
			String c= "@gmail.com";
			String e= "";
			String f="";
			for (i=x;i<=s.length()-1;i++)
				{
						char d = s.charAt(i);
						 e = e+d;

				}
		if(e.equals(c))
		{
		}
			else
				System.out.println("You entered wrong E-mail plzz check again!..");
						for (i=0;i<=s.indexOf('@')-1;i++)
						{
							char d = s.charAt(i);
							if(Character.isUpperCase(d)==true)
							{
							System.out.println("Plizz do not use any capital letter on Email like (A,B,C)");
							break;
							}
							else
							{
								System.out.println("Congractulation Your E-mail is correct");
								break;

						}






	}


}


}
//yogeshbaviskar0603@gmail.com