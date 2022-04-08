import java.util.*;
public class Student
{
	private int ID;
	private String city;
	private String name;

		public  void getStd()
		{
			Scanner in = new Scanner (System.in);
			System.out.println("Enter Student ID :");
			ID = in.nextInt();
			in.nextLine();
			System.out.println("Enter Name Of the Student :");
			name= in.nextLine();

			System.out.println("Ente the City of the Student :");
			city= in.nextLine();

		}
			public void putStd()
			{

				System.out.println("\t   "+ID+"     \t   "+name+"     \t   "+city );
			}
					public static void main(String [] args)
					{
						Scanner in =new Scanner (System.in);
				    	 int size=0,i;
				  			  	 System.out.println("Enter Size of your Array to use in this programm");
				    			 size= in.nextInt();
				    			 Student [] s1 = new Student [size];

				    			for (i=0;i<s1.length;i++)
				    			{
									s1[i] = new Student();
										s1[i].getStd();

								}
												System.out.println("-----------------------------------------------------------");
												System.out.println("                 Student Information                           ");
												System.out.println("-----------------------------------------------------------");
												System.out.println("\t| 1.ID | \t | 2.Name | \t | 3.City |                  ");
												System.out.println("-----------------------------------------------------------");
											//	System.out.println("----------------------------------------------------------");
										for (Student x : s1)
										{
												x.putStd();

										}
										System.out.println("-----------------------------------------------------------");





					}
}
