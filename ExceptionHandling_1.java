//AUTOMATION BATCH - 51, ASSIGNMENTS -62;

package basicprg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_1
{
public static void main(String[] args)
{
      
	try {
	Scanner s1=new Scanner (System.in);
	System.out.println("Please enter your age");
	int age= s1.nextInt();
	}
	catch(InputMismatchException m1)
	{
		try {
			Scanner s1=new Scanner (System.in);
			System.out.println("Please enter your age and must be only number");
			int age= s1.nextInt();
		}
		catch(InputMismatchException m2)
		{
			Scanner s1=new Scanner (System.in);
			System.out.println("Please enter your age and must be only number");
			int age= s1.nextInt();
		}
	}
}
}
