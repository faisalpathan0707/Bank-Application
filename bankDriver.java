 import java.util.Scanner;
 class bankDriver
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Holder Name :- ");
		String name=sc.nextLine();
		System.out.println("Enter Account Number :- ");
		long accNo=sc.nextLong();
		System.out.println("Enter a Balance:-");
		double bal=sc.nextDouble();
		System.out.println("Enter GPay password :- ");
		int pass1=sc.nextInt();
		System.out.println("Enter UPI Password:- ");
		int pass2=sc.nextInt();
		System.out.println("Enter Phone Pay Password:- ");
		int pass3=sc.nextInt();
		System.out.println("Enter Upi Pay Password:- ");
		int pass4=sc.nextInt();	
		System.out.println("Account is Created ");

	    bank a1 =new bank(name,accNo,bal,pass1,pass2,pass3,pass4);
    for(;;)
    {
    	System.out.println("1.Google_Pay 2.Phone_pay 3.Exit");
    	int option=sc.nextInt();
    	if(option==1)
    	{
    		a1.gPay();
    	}
    	else if(option==2)
    	{
    		a1.pPay();
    	}
    	else
    	{
    		System.exit(0);
    	}
    }
 }
}
