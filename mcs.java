class mcs 
{
	public static void main(String[] args) 
	{
		System.out.println("1");
		m1(100);
		System.out.println("2");
	}
	public static void m1(int a)
	{
		System.out.println("3");
		m2('a');
		System.out.println("2");
	}
	public static void m2(char a)
	{
		System.out.println('a');
	}
}
