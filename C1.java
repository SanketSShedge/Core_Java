// MULTI-LEVEL INHERITANCE
class A1 
{
	static double d=10;
}
class B1 extends A1
{
	static int a = 50;
}
class C1 extends B1
{
	public static void main(String[] args) 
	{
		double b = 100;
		System.out.println(b); //Declared
		System.out.println(d); //Inherited
		System.out.println(a); //Inherited
	}
}
	
