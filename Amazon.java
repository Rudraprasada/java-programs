 //AUTOMATION BATCH - 51, ASSIGNMENTS -42;

package basicprg;
class Amazon11
{
	Amazon11()
	{
		System.out.println("This is parent constructor");
	}
}

public class Amazon extends Amazon11
{
	 Amazon ()
	 {
		 super(); //super calling statement
		 System.out.println("This is child constructer");
	 }
	 
public static void main(String[] args)
{
	new Amazon ();
}
}

