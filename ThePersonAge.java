import java.util.*;
class ThePersonAge
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the Age of person ");
		int age =in.nextInt();
		if(age<18)
		System.out.println("The person is Child ");
		if(age>=18 && age<65)
		System.out.println("The person is Adult");
		if(age>65)
		System.out.println("The person is Sinior Citizen");
	}

}