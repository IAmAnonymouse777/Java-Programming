import java.util.Scanner;
class Sorting
{
private static int i,j,n=5;
private static int [] a = new int [5];

 	 static void Sort()
			{
				for (i=0;i<n;i++)
				{
					for (j=1;j<(n-i);j++)
					{
						if (a[j]<a[j-1])
						{
							int temp;
							temp=a[j];
							a[j]=a[j-1];
							a[j-1]=temp;
						}
					}
				}
			}
		public static void main(String args[])
		{

							Scanner in = new Scanner (System.in);
						 		System.out.println(" Enter Element in Array");
						 		for (int i=0;i<5;i++)
						 		a[i]=in.nextInt();
						 		System.out.println("The  Array Element Before Sorting is ");
						 		for (int i=0;i<5;i++)
						 		System.out.println(a[i]);
				 		System.out.println("Array After Sorting =");
				 		 Sort();
				 		 for(int k : a)
				 		 {
							 System.out.println(k);
						}

		}

}






