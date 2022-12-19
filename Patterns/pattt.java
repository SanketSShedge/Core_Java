
// *234*
// **3**
// *****

class pattt
{
	public static void main(String[] args)
	{
		for(int i=1;i<=3;i++)
		{
			int a=1;
			for(int j=1;j<=5;j++)
			{
				if(i==1)
				{
					if(j==2 || j==3 || j==4)
					{
						System.out.print(a);
					}
					else
					{
						System.out.print("*");
					}
					a++;
				}
				else
				{
					if(i==2 && j==3)
					{
						System.out.print(a);
					}
					else
					{
						System.out.print("*");
					}
					a++;
				}
			}
			System.out.println();
		}
	}
}

