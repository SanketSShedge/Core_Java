
// * * * * * *
// * 1 2 3 4 *
// * 2 3 4 5 *
// * 3 4 5 6 *
// * 4 5 6 7 *
// * * * * * *

class pattern 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==1 || j==1 || i==6 || j==6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(i+j-3+" ");
				}
			}
			System.out.println();
		}
	}
}
