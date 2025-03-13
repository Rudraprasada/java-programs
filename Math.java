//AUTOMATION BATCH - 51, ASSIGNMENTS -51;

package basicprg;
interface Math1
{
	void add();
	void sub();
}

public class Math implements  Math1
{
public static void main(String[] args)
{
	 Math m=new  Math();
	 m.add();
	 m.sub();
}


public void add()
{
	int a=56;
	int b=98;
	System.out.println(a+b);
	
}


public void sub() 
{
	int a=56;
	int b=98;
	System.out.println(a-b);
	
}
}
