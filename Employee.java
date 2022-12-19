class Employee
{
	String Ename = "SANKET";
	int Eid = 333;
}
class Programmer extends Employee
{
	double sal = 40000d;

    public static void main(String[] args) 
	{
	  Programmer p1 = new Programmer();
	  System.out.println("Ename : "+p1.Ename);
	  System.out.println("Eid : "+p1.Eid);
	  System.out.println("Salary : "+p1.sal);
	}
}
