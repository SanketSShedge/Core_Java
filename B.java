// SINGLE-LEVEL INHERITANCE
class A 
{
	static int a=10;
}
class B extends A
{
	public static void main(String[] args) 
	{
		int b=50;
		System.out.println(a); //Inherited 
		System.out.println(b); //Declared
	}
}
	

