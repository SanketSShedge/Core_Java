class smli 
{
	static
	{
		System.out.println("1");
	}
	public static void main(String[] args) 
	{
		System.out.println("2");
	}
	public static void m2()
	{
		System.out.println("3");
	}
	static
	{
		m2();
		System.out.println("4");
	}
}
