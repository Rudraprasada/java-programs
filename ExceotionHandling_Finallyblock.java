//AUTOMATION BATCH - 51, ASSIGNMENTS -64;

package basicprg;

public class ExceotionHandling_Finallyblock
{
public static void main(String[] args)
{
	try {
		int a=1/0;
		System.out.println(a);
	}
	catch(ArithmeticException c1)
	{
		System.out.println("catch block");
		int a=1/1;
		System.out.println(a);
	}
	finally
	{
		System.out.println("finally block");
		int a=1/2;
		System.out.println(a);
	}
}
}

