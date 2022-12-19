class BookDriver 
{
	public static void main(String[] args) 
	{
		Book b1=new Book();
		System.out.println(b1.getPrice());
		b1.setPrice(50);
		System.out.println(b1.getPrice());
		b1.setTitle("Sanket S Shedge");
		System.out.println(b1.getTitle());
	}
}
