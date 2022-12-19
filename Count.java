// WAJP to count no. of digits in given number.
class Count
{
	public static void main(String[] args) 
	{
		int n = 5698752;
		int count = 0;
		while (n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count++);
	}
}
