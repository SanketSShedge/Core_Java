class Animal1
{
	public void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Animal1
{
	public void bark()
	{
		System.out.println("barking...");
	}
}
class Cat extends Animal1
{
	public void meow()
	{
		System.out.println("meow...");
	}
}
class Inheritance1
{
		public static void main(String[] args) 
	{
		Cat c1= new Cat();
		c1.eat();
		c1.bark();
		c1.meow();
	}
}

