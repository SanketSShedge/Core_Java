class SimcardDriver
{
	public static void main(String[] args) 
	{
		SimCard s1 = new SimCard(1234569874);
		System.out.println(s1.getServ());
		s1.setServ("IDEA");
		System.out.println(s1.getServ());
		System.out.println(s1.getLoc());
		s1.setLoc(599.99);
        System.out.println(s1.getLoc());
		s1.printSimDetails();
	}
}
