// Pattern to print pyramid of 3 rows

//  *
//  **
//  ***

class pat1 
{
	public static void main(String[] args) 
	{int n=4;
		for(int i=0;i<n;i++)          //for rows
		{
			for(int j=0;j<i;j++)      //to print star
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
