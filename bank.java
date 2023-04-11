import java.util.Scanner;
class bank
{
	String accountHolderName;
	long accNo;
	double bal;
	int Gppass;
	int upipass;
	int ppay;
	int upipay;
	Scanner sc=new Scanner(System.in);
	bank(String s1,long a1,double d1,int p1,int p2,int p3,int p4)
	{
		accountHolderName=s1;
		accNo=a1;
		bal=d1;
		Gppass=p1;
		upipass=p2;
		ppay=p3;
		upipay=p4;
	}
	public void gPay()
	{
		System.out.println("Enter a Gpay Passworld ");
		int pswd=sc.nextInt();
		if(pswd==Gppass)
		{
			System.out.println("1.Check Balance 2.Send Money ");
			int choice=sc.nextInt();
			if(choice==1)
			{
				balcheck();
			}
			else if(choice==2)
			{
				System.out.println("Enter a Contact Number ");
				long contactNumber=sc.nextLong();
				System.out.println("Enter a Money ");
				double money=sc.nextDouble();
				if(money<bal)
				{
					System.out.println("Enter A UPI GPay Password ");
					int upi=sc.nextInt();
					if(upi==upipass)
					{
						bal=bal-money;
						System.out.println("Transection is Succesful");
					}
					else
					{
						System.out.println("Invalid pin ");
					}
				}
				else
				{
					System.out.println("Insufficent Fund");
				}
			}
			else
			{
				System.out.println("You are select a Wrong Option   ");
			}
		}
		else
		{
			System.out.println("Inccorrect password ");
		}
	}
	public void pPay()
	{
		System.out.println("Enter a PhonePay Password ");
		int pswd=sc.nextInt();
		if(pswd==ppay)
		{
			System.out.println("1.Check balance 2.Send Money ");
			int choice=sc.nextInt();
			if(choice==1)
			{
				balcheck();
			}
			else if(choice==2)
			{
				System.out.println("Enter A contact number :- ");
				long contactNumber=sc.nextLong();
				System.out.println("Enter a Money :- ");
				double money=sc.nextDouble();
				if(money<bal)
				{
					System.out.println("Enter a phonepay Password:- ");
					int upi=sc.nextInt();
					if(upi==upipay)
					{
						bal=bal-money;
						System.out.println("Transection is Succesfull ");
					}
					else
					{
						System.out.println("Invallid Pin ");
					}
				}
				else
				{
					System.out.println("Insufficent Fund ");
				}
			}
			else
			{
				System.out.println("You are Selecting a Wrong Option ");
			}
		}
		else 
		{
			System.out.println("Incorrect Password ");
		}
	}
	public void balcheck()
	{
		System.out.println("Enter a UPI pin :- ");
		int upicb=sc.nextInt();
		if(upicb==upipass||upicb==upipay)
		{
			System.out.println(bal);
		}
		else
		{
			System.out.println("Incorrect Password ");
		}
	}
}