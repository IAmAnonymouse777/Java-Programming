class Parent
{
	int a,b;

	Parent()
	{

	  int add=a+b;
	     System.out.println("The addition is = "+add);
	}
}
class child extends Parent
{
	int a,b;
		child(int c,int d,int e,int f)
			{
				super.a=e;
				super.b=f;
				a=c;
				b=d;
				int mul=a*b;
				System.out.println("The Multiplication is =  "+mul);
			}

}
class useOfSuperKeywordInField
{
	public static void main(String args[])
	{
	child s1 = new child(10,20,30,50);
	}

}











