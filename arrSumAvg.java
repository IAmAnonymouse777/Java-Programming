import java.util.*;
  class arrSumAvg
  {
   	public static void main(String args[])
   	{
   	    Scanner in = new Scanner (System.in);
   		int [] a = new int [5];
   		int i,sum=0;


   		System.out.println("Enter "+a.length+" element in array ");

   			for(i=0;i<a.length;i++)
   			    a[i]=in.nextInt();
   			    System.out.println("Array is = ");

   			 for(int x : a )
				{
					System.out.println("\t"+x);
					sum+=x;
				}
				System.out.println("Sum of All array are = "+sum);
				float avg=(float)sum/a.length;

				System.out.println("Average are = "+avg);


   	}
   }