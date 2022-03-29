import java.util.*;
  class arrReverse
  {
   	public static void main(String args[])
   	{
   	    Scanner in = new Scanner (System.in);
   		int [] a = new int [5];
   		int i;


   		System.out.println("Enter "+a.length+" element in array ");

   			for(i=0;i<a.length;i++)
   			    a[i]=in.nextInt();

   			    System.out.println("Reverse Order Array element are ... ");

   			    for(i=a.length-1;i>=0;i--)
   			      System.out.println(a[i]);
   	}
   }