class X
{
	double d = 1.5;
	public void m1()
	{
		System.out.println(d);
	}
	{
		System.out.println("a");
		m1();
	}
	X()
	{
		System.out.println("d");
	}
}
class Y extends X
{
	public void m2()
	{
		System.out.println(s);
	}
	{
		System.out.println("b");
	}
	Y(int a)
	{
		System.out.println("y");
	}
	Y(char b)
	{
		System.out.println("z");
	}
	Y()
	{
		super();
		System.out.println("e");
		m2();
	}
	String s ="WCCE5";
	public static void main(String[] args) 
	{
		Y y1=new Y();
		System.out.println("c");
	}
}
