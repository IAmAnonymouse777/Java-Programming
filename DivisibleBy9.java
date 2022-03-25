class DivisibleBy9
{
	public static void main(String [] args)
	{
		int i;
		System.out.println("The number divisible into 400 to 500 by 9 As follows ");

		for(i=400;i<=500;i++)
		{
			if(i%9==0)
			System.out.println(i);
		}
	}
}