//WAJP to check given no. is palindrome or not.

import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		int rev = 0;
		int temp = n;
		while(n>0)
		{
			int a = n%10;
			rev = (rev*10)+a;
			n = n/10;
		}
		if (temp == rev)
		{
			System.out.println("Given no. is Palindrome.");
		}
		else
		{
			System.out.println("Given no. is not a Palindrome.");
		}
	}
}
