class num 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j || i==5 )
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
			System.out.println("");
		}
	}
}
