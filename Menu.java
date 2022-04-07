import java.util.*;
class Menu
{
	public static void main(String args[])
	{
		int kaju;
		int kajut=0; // mistake= assign 0 to initialize the the starting value to kajut gulabt,laddut, and  motipakt, ; and always delclaire vriable in starting of main method;
		int gulab;
		int gulabt=0;
		int laddu;
		int laddut=0;
		int motipak;
		int motipakt=0;
		int add=0;
		int cho;

	 Scanner sc = new Scanner(System.in);


	 do
	 {
		 System.out.println("\n!!!MENU!!!\n");
	 	System.out.println("1.Kaju Katli\n2.Gulab Jamun\n3.Laddu\n4.Motipak\n5.No Else & Bill\n6.Exit.."); //and add Exit choice function also;
	 	//Get First Menu input and ask for the choice for the user; see below
	 	//and keep add at least one \n to print line to see output in crystel clear format in any menu driven programm;
	 	System.out.println("\nEnter your choice ");
		  cho = sc.nextInt();
	 	switch(cho)
	 	{
	 		case 1:
	 		System.out.println("\nYour order is 'Kaju Katli Rs.900' \nHow much 1kg, 2kg....");
	 		kaju = sc.nextInt();
	 		kajut = kaju*900;
	 		System.out.println("\nAmount is:"+kajut);
	 		break;

	 		case 2:
	 		System.out.println("\nYour order is 'Gulab Jamun Rs.400' \nHow much 1kg, 2kg....");
	 		 gulab = sc.nextInt();
	 		gulabt = gulab*400;
	 		System.out.println("\nAmount is:"+gulabt);
	 		break;

	 		case 3:
	 		System.out.println("\nYour order is 'Laddu Rs.250' \nHow much 1kg, 2kg....");
	 		laddu = sc.nextInt();
	 		laddut = laddu*250;
	 		System.out.println("\nAmount is:"+laddut);
	 		break;

	 		case 4:
	 		System.out.println("\nYour order is 'Motipak Rs.550' \nHow much 1kg, 2kg....");
	 		motipak = sc.nextInt();
	 		motipakt = motipak*550;
	 		System.out.println("\nAmount is:"+motipakt);
	 		break;

	 		case 5:
	 		add =kajut+gulabt+laddut+motipakt;
	 		System.out.println("\nYour total amount is:"+add);
	 		break;
	 		case 6:
	 		System.out.println("\nHAVE A NICE DAY SIR GOOD BYE.. Thanks for joining us..");
	 		break;

	 		default:
	 		System.out.println("\nPlease see proper menu.");

	 	}

	 }while(cho!=6);

	 sc.close();
	}
}