//AUTOMATION BATCH - 51, ASSIGNMENTS -50;

package basicprg;
abstract class program1
{
	abstract void add();
	abstract void sub();
	void login()
	{
		System.out.println("Logic to  expose 1");
	}
	static void logout()
	{
		System.out.println("Logic to  expose 2");
	}
}

public class Abstract__coceretemethods extends program1
{

	void add()
	{
		System.out.println("Logic to keep 1");
	}

	void sub() 
	{
		System.out.println("Logic to  keep 2");
		
	}
public static void main(String[] args) 
{
	Abstract__coceretemethods a=new Abstract__coceretemethods();
	a.add();
	a.sub();
	a.login();
     logout();
}
}
