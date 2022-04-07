import java.util.*;
class student
{
	Scanner in =new Scanner (System.in);
 	 String name;
 	 int id;

 	 	void setdata()
 	 	{
			System.out.println("Enter the student name ");
			name = in.nextLine();
			System.out.println("Enter student ID ");
			id = in.nextInt();

		}
	void putdata()
	{
		System.out.println("The name of student is = "+name);
		System.out.println("The ID of the student is = "+id );
	}
	public static void main(String args [])
		{
			int i;
			student [] s = new student [5];
			for (i=1;i<=5;i++)
			s[i].setdata();

			for (i=1;i<=5;i++)
			{
			//	s[i].new student();
			s[i].putdata();
			}
	}

}
