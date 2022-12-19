import java.util.Scanner;
class oddnum
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		for(int i=0;i<=n-1;i++)
		{
			if(n%2!=0)
			{
				System.out.println("Number is odd.");
			}break;
		}
	}
}
