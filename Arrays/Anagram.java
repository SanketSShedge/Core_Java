import java.util.Arrays;
class Ana 
{
	public static void main(String[] args) 
	{
		String s1="SILENT";
		String s2="LISTEN";
		
		char[] a=s1.toCharArray();        // to convert string into character array.
		char[] b=s2.toCharArray();        // to convert string into character array.
		
		Arrays.sort(a);
		Arrays.sort(b);

		boolean res=Arrays.equals(a,b);
		if(res==true)
		{
			System.out.println("It is an Anagram.");
		}
		else
		{
			System.out.println("It is not an Anagram.");
		}
	}
}
