class Animal
{
	public void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("barking...");
	}
}
class BabyDog extends Dog
{
	public void weep()
	{
		System.out.println("weeping...");
	}
}
class Inheritance
{
		public static void main(String[] args) 
	{
		BabyDog b1= new BabyDog();
		b1.eat();
		b1.bark();
		b1.weep();
	}
}
