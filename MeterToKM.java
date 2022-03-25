import java.util.*;
class MeterToKM
{
	public static void main(String [] args)
	{
	 Scanner in = new Scanner(System.in);
		float met;
		float km;
				System.out.println("Enter the meter to convert into kilometers");
				met = in.nextFloat();
	km = met/1000;
				System.out.println("The meter into kilometer is = "+km+" KM");
	}


}