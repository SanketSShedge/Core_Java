// Pattern to print pyramid of 5 rows

// *
// **
// ***
// ****
// *****

class pat1
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

