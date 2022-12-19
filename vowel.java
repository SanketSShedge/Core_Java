import java.util.Scanner;
class vowels 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		char c=s.next().charAt(0);
		if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
		{
			System.out.println("It is vowel.");
		}
		else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			System.out.println("It is vowel.");
		}
		else
		{
			System.out.println("It is not vowel.");
		}
	}
}
