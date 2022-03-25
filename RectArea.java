import java.util.*;
class RectArea
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter length and breath ");
		int l= in.nextInt();
		int b= in.nextInt();
		int area=l*b;
		System.out.println("The area of Rectangle is = "+area);

	}
}