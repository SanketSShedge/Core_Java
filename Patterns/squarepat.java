class squarepat 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			int k=i;
			for (int j=1;j<=i+1 ;j++ )
			{
				System.out.print(k+" ");
				k=k*2;
			}
			System.out.println();
		}
	}
}
