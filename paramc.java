class Laptop
{
	int ram;
	String brand;
	double price;
	Laptop(int i,String s,double d){
		ram=i;
		brand=s;
		price=d;
	}
	public static void main(String[] args) 
	{
		Laptop l=new Laptop(8,"Dell",62000);
		System.out.println(l.ram);
		System.out.println(l.brand);
		System.out.println(l.price);
	}
}
