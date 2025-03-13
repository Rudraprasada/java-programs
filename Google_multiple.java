//AUTOMATION BATCH - 51, ASSIGNMENTS -53;

package basicprg;
interface one
{
	void add();
	void sub();
}
interface two
{
	void mul();
	void div();
}

public class Google_multiple implements one,two
{
public static void main(String[] args) 
{
	Google_multiple a =new Google_multiple();
	a.add();
	a.sub();
	a.div();
	a.mul();
}

public void mul() 
{
	int a=56;
	int b=86;
	
	System.out.println(a*b);
			
}


public void div() 
{
	int a=56;
	int b=86;
	
	System.out.println(a/b);
}


public void add()
{
	int a=56;
	int b=86;
	
	System.out.println(a+b);
	
}


public void sub()
{
	int a=56;
	int b=86;
	
	System.out.println(a-b);
}
}
