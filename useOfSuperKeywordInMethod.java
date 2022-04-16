class Parent
{
	int a,b=50;

	Parent(int x)
	{
	     a=x;
	  int add=a+b;
	     System.out.println("The addition is = "+add);
	}
}
class child extends Parent
{
	int a,b;
		child(int c,int d,int e)
			{
				super(10);
				a=c;
				b=d;
				int mul=a*b;
				System.out.println("The Multiplication is =  "+mul);
			}

}
class useOfSuperKeywordInMethod
{
	public static void main(String args[])
	{
	child s1 = new child(10,20,30);
	}

}











