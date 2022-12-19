import java.util.Scanner;
class aot
{
	public static double aot()
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		double c=0.5*a*b;
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the sides of triangle:");
		aot();
	}
}

