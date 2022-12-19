import java.util.Scanner;
class scannerip2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student's name:");
		String a=s.nextLine();
		System.out.println("Enter student's ID:");
		int id=s.nextInt();
		System.out.println("Enter Student's division:");
		char d=s.next().charAt(0);
		System.out.println("Enter student's marks:");
		double m=s.nextDouble();
		System.out.println("-----Student's Info-----");
		System.out.println("Student's name:"+a);
		System.out.println("Student's ID:"+id);
		System.out.println("Student's division:"+d);
		System.out.println("Student's marks:"+m);
	}
}
