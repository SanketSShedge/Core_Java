class X
{
	{
	 System.out.println("a");
	}
	X()
	{
	}
	double d = 1.5;
}
class Y extends X
{
	{
		System.out.println("b");
	}
	Y()
	{
		super();
	}
	String s ="a";
	public static void main(String[] args) 
	{
		Y y1=new Y();
		System.out.println("c");
	}
}
