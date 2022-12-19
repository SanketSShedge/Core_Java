class Fruit2
{
	String colour;
	double price;

	Fruit2(String a,double b)
	{
		colour = "Orange";
		price = 150d;
	}
}
class Apple extends Fruit2
{
	String origin;

	Apple()
	{
		super("abc",10d);
	}
		public static void main(String[] args) 
	{
		Apple a1 = new Apple();
		System.out.println("Colour: "+a1.colour);
		System.out.println("Price: "+a1.price);
		System.out.println("Origin: "+a1.origin);
	}
}
class Driver
{
}