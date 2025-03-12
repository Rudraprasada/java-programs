//AUTOMATION BATCH - 51, ASSIGNMENTS -44;

package basicprg;

public class Employee
{
	Employee()
	{
		this(98000.00);
		System.out.println("1");
	}
	Employee(double salary)
	{
		this("marco");
		System.out.println("2");
	}
	Employee(String name)
	{
		
		System.out.println("3");	
	}
	public static void main(String[] args)
	{
		new Employee();
	}
}
