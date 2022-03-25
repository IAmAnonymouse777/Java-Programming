import java.util.*;
class AreaCir
{
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the redius");
		double r= in.nextFloat();
		double area=3.14*r*r;
		System.out.println("The area of circle is = "+area);
	}

}