class melement
{
	public static void main(String[] args) 
	{
		int a[]={1,3,5,6,8};
		for (int i=1; i<=8 ; i++ )
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(i == a[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}

