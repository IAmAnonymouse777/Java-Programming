class Parent
{
private int c,d;
 void set (int x , int  y)
	{
	 	c=x;
	 	d=y;
	}
  int AddDisp()
     {
       int add=0;
       add=c+d;
       return  add;
     }

}
class Child extends Parent
{
int a,b;
	Child(int y , int z)
	{
		a=y;
		b=z;


	}
	int MulDisp()
	     {
	       int mul=0;
	       mul=a*b;
	       return mul;
     }
     void PrintData()
     {
    	System.out.println("The addition is = "+ AddDisp());
    	System.out.println("The multiplicatin is = "+MulDisp());
     }

}
class SingleLevelInheritance
{
	public static void main(String args[])
	{
		Child s1= new Child (10,20);
		s1.set(10,20);
	//	Parent s2= new Parent(20,30);
		s1.PrintData();

	}
}