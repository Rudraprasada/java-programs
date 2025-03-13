//AUTOMATION BATCH - 51, ASSIGNMENTS -11;

package basicprg;
public class Nonstaticmethod{
	void addition()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	public static void main(String[] args)
 {
		Nonstaticmethod n=new Nonstaticmethod();
		n.addition();
 }
}
