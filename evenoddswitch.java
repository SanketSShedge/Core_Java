import java.util.Scanner;
class evenodd 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		switch(n%2)
		{
			case 0:
			{
				System.out.println("Number is even.");
			}break;
			case 1:
			{
				System.out.println("Number is odd.");
			}break;
			default:
			{
				System.out.println("Invalid input.");
			}
		}
	}
}
