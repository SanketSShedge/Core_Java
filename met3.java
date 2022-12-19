import java.util.Scanner;
class met3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character:");
		char c=s.next().charAt(0);
		ascii(c);
	}
	public static void ascii(char c)
	{
		int n=c;
		System.out.println(n);
	}
}

