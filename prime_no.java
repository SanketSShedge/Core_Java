import java.util.Scanner;
class prime 
{
	public static void main(String[] args) 
	{
		Scanner s=nw Scanner(System.in);
		int i=s.nextInt();
		System.out.println("Enter the numbers:");
		if(i%3==0)
		{
			System.out.println("Prime no.");
		}
		else
		{
			System.out.println("Not a prime no.");
		}
	}
}
