//AUTOMATION BATCH - 51, ASSIGNMENTS -40;

package basicprg;
class b
{
	static void add()
	{
		int a=65;
		int b=56;
		int sum=a+b;
		System.out.println(sum);
				
	}
}
class c extends  b

{
	static void sub()
	{
		int a=65;
		int b=56;
		int sub=a-b;
		System.out.println(sub);
				
	}
}
public class class1 extends c
{
	static void mul()
	{
		int a=65;
		int b=56;
		int mul=a*b;
		System.out.println(mul);
				
	}
	public static void main(String[] args) 
	{
		mul();
		sub();
		add();
		
	}
}
