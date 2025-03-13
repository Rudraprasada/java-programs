//AUTOMATION BATCH - 51, ASSIGNMENTS -12;
package basicprg;
public class Nonstaticmethods3 {
	void addition()
		{
			int a=100;
			int b=200;
			System.out.println(a+b);
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
			Nonstaticmethods3  n=new Nonstaticmethods3();
			n.addition();
			n.subtract();
			n.name();
	 }
}
