//WAJP to count the even digits in the given number.

import java.util.Scanner;
class  evencount
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		int temp = 0;
		int count = 0;
		while(n>0)
		{
			temp = n%10;
			n = n/10;
			if(temp%2==0)
			{
				count++;
			}
		}
		System.out.println(count++ +" even numbers are present.");
	}
}
