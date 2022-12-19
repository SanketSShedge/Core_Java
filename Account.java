class Account 
{
 private String Accname;
 private int Accnum;
 private double Accbal;

 	Account(int Accnum)
	{
		this.Accnum = Accnum;
    }
	public String getAccname()
	{
		return Accname;
	}
	public void setAccname(String Accname)
	{
		this.Accname = Accname;
	}
	public int getAccnum()
	{
		return Accnum;
	}
	public double getAccbal()
	{
		return Accbal;
	}
	public void setAccbal(double Accbal)
	{
		this.Accbal = Accbal;
	}
	public void accountDetails()
	{
		System.out.println("Printing accountDetails:-");
		System.out.println("Account holder's name:- "+Accname);
		System.out.println("Account number:- "+Accnum);
		System.out.println("Balance:- "+Accbal);
	}
}
