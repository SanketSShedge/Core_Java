//WAJP to design arithmetic calculations using methods.

import java.util.Scanner;
class calc
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		add(int a,int b);
		sub(int a,int b);
		mul(int a,int b);
		div(int a,int bss);
	}
	public static void add(int a,int b)
	{
		System.out.println("Addition is:");
		int c=a+b;
		System.out.println(c);
	}
	public static void sub(int a,int b)
	{
		System.out.println("Subtraction is:");
		int d=a-b;
		System.out.println(d);
	}
	public static void mul(int a,int b)
	{
		System.out.println("Multiplication is:");
		int e=a*b;
		System.out.println(e);
	}
	public static void div(int a,int b)
	{
		System.out.println("Division is:");
		int f=a/b;
		System.out.println(f);
	}
}
