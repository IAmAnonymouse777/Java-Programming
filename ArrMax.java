import java.util.*;
  class ArrMax
  {
   	public static void main(String args[])
   	{
   	    Scanner in = new Scanner (System.in);
   		int [] a = new int [5];
   		int i,max=0;


   		System.out.println("Enter "+a.length+" element in array ");

   			for(i=0;i<a.length;i++)
   			    a[i]=in.nextInt();

   			    max=a[0];
   			    System.out.println("Array is = ");
   			    for (i=0;i<a.length;i++)
   			    {
   			    	System.out.println(a[i]);
   			     	if (a[i]>max)
   			     	{
   			     		max=a[i];
   			     	}

   			    }
   			 System.out.println("Maximum number frome array is = "+max);

   	}
   }