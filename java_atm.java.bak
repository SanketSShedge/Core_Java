import java.util.Scanner;
class java_atm
{
	String name;
	int pin;
	double balance=50000;
	
	java_atm(String name,int pin)
	{
		this.name=name;
		this.pin=pin;
	}
		
	public void balance()
	{
		System.out.println("\n-------------------------------------");
		System.out.println("Your current balance is:"+balance);
		System.out.println("-------------------------------------");
	}

	public void setwcash(double d)
	{
		if(d<=balance)
		{
			balance=balance-d;
			System.out.println("\n----------------------------------");
			System.out.println(d+" is debited from your account.");
			System.out.println("Your updated balance is:"+balance);
			System.out.println("Please collect the cash.");
			System.out.println("----------------------------------");
		}
		else
		{
			System.out.println("\n-------------------------------------");
			System.out.println("Unable to process the transaction");
			System.out.println("-------------------------------------");
		}
	}

	public void setdcash(double e)
	{
		balance=balance+e;
		System.out.println("\n-------------------------------------");
		System.out.println(e+" is credited to your account.");
		System.out.println("Your updated balance is:"+balance);
		System.out.println("-------------------------------------");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		java_atm a1=new java_atm("Sanket S Shedge",7272);
		System.out.println("****WELCOME TO JAVA ATM MACHINE****");
		System.out.println("Insert the CARD.");
		System.out.println("\n1.Current Account.\n2.Saving Account.");
		System.out.println("\nPlease enter 1 for Current Account or 2 for Saving Account:");
		int a = sc.nextInt();
		while(true)
		{
			if (a==1 || a==2)
			{
				System.out.println("\n1.Check Balance.\n2.Withdraw amount.\n3.Deposit Amount.\n4.Exit");
				System.out.println("Please enter the valid CHOICE:");
				int b = sc.nextInt();
				switch(b)
				{
				case 1:
						a1.balance();
						break;
				case 2:
						System.out.println("Please enter the withdraw amount:");
						double d=sc.nextDouble();
						a1.setwcash(double d);
						break; 
				case 3:
						System.out.println("Please enter the deposit amount:");
						double e=sc.nextDouble();
						a1.setdcash(double e);
						break;
				case 4: 
						System.exit(0);
				}
			}
		}
	}
}
	