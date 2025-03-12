//AUTOMATION BATCH - 51, ASSIGNMENTS -13;
package basicprg;
public class combationofstaticandnonstaticmethords
{
	static void addition()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	static void student()
	{
		System.out.println("MARCO");
	}
void subtract()
{
	int a=100;
	int b=200;
	System.out.println(a-b);
}
void name()
{
	System.out.println("Rudra prasad mohapatra");
}
	public static void main(String[] args)
 {
		combationofstaticandnonstaticmethords  n=new combationofstaticandnonstaticmethords();
		addition();
		student();
		n.subtract();
		n.name();
 }
}
