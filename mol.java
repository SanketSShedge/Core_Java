class mol 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		mul();
	}
	public static void mul()
	{
		System.out.println("1");
		mul(1);
	}
	public static void mul(int i)
	{
		System.out.println("2");
		mul(1,'a');
	}
	public static void mul(int a,char c)
	{
		System.out.println("3");
	}
}
