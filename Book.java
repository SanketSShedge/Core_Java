class Book 
{
	private int bid;
	private String title;
	private double price;
	Book()
	{
	}
	Book(int bid)
	{
		this.bid=bid;
	}
	Book(String title)
	{
		this.title=title;
	}
	Book(int bid,String title,double price)
	{
		this.bid=bid;
		this.title=title;
		this.price=price;
	}
	public int getBid()
	{
		return bid;

	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
}
