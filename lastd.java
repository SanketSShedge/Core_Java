import java.util.Scanner;
class lastd 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		a=a%100;
		System.out.println("Last digit is:"+a);
	}
}
