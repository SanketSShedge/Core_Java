class SimCard
{
  private long number;
  private String service_provider;
  private double local_call_rate;

  SimCard(long number)
  {
   this.number = number;
  }
  SimCard(long number, String service_provider)
  {
	  this.number = number;
	  this.service_provider = service_provider;
  }
  SimCard(long number, String service_provider, double local_call_rate)
  {
	  this.number = number;
	  this.service_provider = service_provider;
	  this.local_call_rate = local_call_rate;
  }
  public long getNum()
	{
	  return number;
	}
  public String getServ()
	{
	  return service_provider;
	}
  public void setServ(String service_provider)
	{
	  this.service_provider = service_provider;
	}
  public double getLoc()
	{
	  return local_call_rate;
	}
  public void setLoc(double local_call_rate)
	{
	  this.local_call_rate = local_call_rate;
	}
	public void printSimDetails()
	{
		System.out.println("Printing SimDetails:-");
		System.out.println("Number:" +number);
		System.out.println("Service Provider:" +service_provider);
		System.out.println("Local call rate:" +local_call_rate);
	}
}
