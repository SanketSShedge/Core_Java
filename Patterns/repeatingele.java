class repeatele 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,7,6,4,7,5,9};
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				if(a[i]==a[j])
				{
					System.out.println("Repeating element is: "+a[j]);
				}
			}
		}
	}
}
