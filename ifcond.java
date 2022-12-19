import java.util.Scanner;
class ifcond 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		if(a%5==0)
		{
			System.out.println(a+" is lucky number");
		}
	}
}
