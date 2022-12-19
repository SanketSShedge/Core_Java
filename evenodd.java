//WAJP to check if the given number is even or odd.

import java.util.Scanner;
class evenodd 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		String s1=n%2==0?"Even number" : "Odd number";
		System.out.println(s1);
	}
}
