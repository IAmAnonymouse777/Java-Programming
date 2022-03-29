import java.util.*;
  class InputArr
  {
   	public static void main(String args[])
   	{
   	    Scanner in = new Scanner (System.in);
   		int [] a = new int [5];
   		int i;


   		System.out.println("Enter "+a.length+" element in array ");

   			for(i=0;i<a.length;i++)
   			    a[i]=in.nextInt();


   			  System.out.println("The array element are...");
   			  	for (i=0;i<a.length;i++)
   			  	  System.out.println(a[i]);


   		System.out.println("Using For Each loop Array element ");
   				for (int x : a)
   				System.out.println(x);
   	}
  }

