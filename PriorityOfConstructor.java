class Parent
{
	Parent()
	{
	 	System.out.println("I Am In Parent Class construsctor");
	}

}
class Child extends Base
{
	Child()
	{
		System.out.println("I Am IN Child class constructor");

	}
}
class PriorityOfConstructor
{
	public static void main(String args[])
	{
		Child s1= new Child ();

	}
}