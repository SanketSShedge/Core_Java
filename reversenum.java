//WAJP to reverse a given number.
import java.util.Scanner;
class reversenum
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		int rev = 0;
		while(n>0)
		{
			int a = n%10;
			rev = (rev*10)+a;
			n = n/10;
		}
		System.out.println("Reverse number is "+rev);
	}
}
