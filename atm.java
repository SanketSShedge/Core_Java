import java.util.Scanner;
class atm
{
public static void main(String[] args)
{
	double balance = 20000;
	double withdraw_amount;
	double deposit_amount;
	Scanner sc = new Scanner(System.in);
	System.out.println("****WELCOME TO JAVA ATM MACHINE****");
	System.out.println("Insert the CARD.");
	System.out.println("\n1.Current Account.\n2.Saving Account.");
	System.out.println("\nPlease enter 1 for Current Account or 2 for Saving Account:");
	int a = sc.nextInt();

	while(true)
	{
	if (a==1 || a==2)
	{
		System.out.println("\n1.Withdraw amount.\n2.Deposit amount.\n3.Check Balance. \n4.Exit");
		System.out.println("Please enter the valid CHOICE:");
		int b = sc.nextInt();
		switch(b) 
		{
		 case 1:
				System.out.println("Please enter the withdraw amount:");
				withdraw_amount=sc.nextDouble();
				if(withdraw_amount<=balance)
				{
					balance=balance-withdraw_amount;
					System.out.println("\n----------------------------------");
					System.out.println(withdraw_amount+" is debited from your account.");
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
				break;
		case 2:
				System.out.println("Please enter the deposit amount:");
				deposit_amount=sc.nextDouble();
				balance=balance+deposit_amount;
				System.out.println("\n-------------------------------------");
				System.out.println(deposit_amount+" is credited to your account.");
				System.out.println("Your updated balance is:"+balance);
				System.out.println("-------------------------------------");
				break;
		case 3:
				System.out.println("\n-------------------------------------");
				System.out.println("Your current balance is:"+balance);
				System.out.println("-------------------------------------");
				break;
		case 4:
				System.exit(0);
		}
	System.out.println("\n============ THANK-YOU ============");
	}
}
}
}