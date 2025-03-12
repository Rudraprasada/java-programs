//AUTOMATION BATCH - 51, ASSIGNMENTS -19;
package basicprg;
public class constructor_overloading {
	constructor_overloading()
	{
		System.out.println("this is my 1st constructor");
	}
	constructor_overloading(int a)
	{
		System.out.println("this is my 2nd constructor");
	}
	public static void main(String[] args)
	{
	new	constructor_overloading();
	new constructor_overloading(55);
	}
}
