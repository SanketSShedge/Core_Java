class AccountDriver 
{
	public static void main(String[] args) 
	{
		Account a1 = new Account(1234);
		System.out.println(a1.getAccname());
		a1.setAccname("SANKET S SHEDGE");
        System.out.println(a1.getAccname());
		System.out.println(a1.getAccnum());
        System.out.println(a1.getAccbal());
		a1.setAccbal(50000);
		System.out.println(a1.getAccbal());
        a1.accountDetails();
	}
}
