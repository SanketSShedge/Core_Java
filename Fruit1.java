class Fruit1
{
	String colour;
	double price;

	Fruit1(String a,double b)
	{
		colour = "YELLOW";
		price = 50d;
	}
}
class Apple extends Fruit1
{
	String origin;

    Apple(String c,double d,String e)
	{
		super("abc",10d);
		origin = e;
	}
	public static void main(String[] args) 
	{
		Apple a1 = new Apple("xyz",50d,"PUNE");
		System.out.println("Colour: "+a1.colour);
		System.out.println("Price: "+a1.price);
		System.out.println("Origin: "+a1.origin);
	}
}
class Driver
{
}