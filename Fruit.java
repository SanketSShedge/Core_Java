class Fruit
{
	String colour;
	double price;
}
class Apple extends Fruit
{
	String origin = "INDIA";
}
class Driver
{
    public static void main(String[] args) 
	{
		Apple a1 = new Apple();
		System.out.println("Colour: "+a1.colour);
		System.out.println("Price: "+a1.price);
		System.out.println("Origin: "+a1.origin);
	}
}