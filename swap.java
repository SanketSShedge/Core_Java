import java.util.Scanner;
class swap 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		int temp=a;
			a=b;
			b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}
