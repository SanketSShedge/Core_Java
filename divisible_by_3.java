//WAJP to print the number which are divisible by 3 in given number.
class divisible_by_3
{
	public static void main(String[] args) 
	{
		int n = 12345678;
		int count = 0;
		while(n>0)
		{
			int a = n%10;
		    if(a%3 == 0)
			{
				count++;
			}
			n = n/10;
		}
		System.out.println(count++);
	}
}
