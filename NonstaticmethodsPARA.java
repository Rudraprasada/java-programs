//AUTOMATION BATCH - 51, ASSIGNMENTS -14;

package basicprg;
public class NonstaticmethodsPARA {
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args)
	 {
		NonstaticmethodsPARA r=new NonstaticmethodsPARA ();
				r.add(50,89);
		r.sub(99,658);
		r.mul(56,54);
	 }
}
