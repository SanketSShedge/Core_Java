class G1
{
	private char c = 'a';
	private String s = "abc";
	public String getS()
	{
		return s;
	}
	public char getC()
	{
		return c;
	}
	public void set(char a)
	{
		c=a;
	}
	public void setS(String s)
	{
		this.s=s;
	}
	public static void main(String[] args) 
	{	
		G1 g=new G1();
		System.out.println(g.c);
	}
}
