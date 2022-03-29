import java.util.*;
  class ArrMin
  {
   	public static void main(String args[])
   	{
   	    Scanner in = new Scanner (System.in);
   		int [] a = new int [5];
   		int i,min=0;


   		System.out.println("Enter "+a.length+" element in array ");

   			for(i=0;i<a.length;i++)
   			    a[i]=in.nextInt();

   			    min=a[0];
   			    System.out.println("Array is = ");
   			    for (i=0;i<a.length;i++)
   			    {
   			    	System.out.println(a[i]);
   			     	if (a[i]<min)
   			     	{
   			     		min=a[i];
   			     	}

   			    }
   			 System.out.println("Maximum number frome array is = "+min);

   	}
   }