//AUTOMATION BATCH - 51, ASSIGNMENTS -61;

package basicprg;

public class ExceptionHandling
{
public static void main(String[] args)
{
	
	try {
	int a=1/0;
	System.out.println(a);
	}
	catch(ArithmeticException a1)
	{
		int a=1/1;
		System.out.println(a);
	}
}
}
