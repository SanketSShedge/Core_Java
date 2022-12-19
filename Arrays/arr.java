import java.util.Scanner;
class array 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int num[]=new int[size];

		// input
		for(int i=0;i<size;i++)
		{
			num[i]=s.nextInt();
		}

		// output
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]+" ");
		}
	}
}
