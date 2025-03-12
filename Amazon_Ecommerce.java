//AUTOMATION BATCH - 51, ASSIGNMENTS -49;

package basicprg;
abstract class Amazon1
{
	abstract void login();
	abstract void logout();
}

public class Amazon_Ecommerce extends Amazon1
{
public static void main(String[] args) 
{
	Amazon_Ecommerce a1=new Amazon_Ecommerce ();
	a1.login();
	a1.logout();
}


void login() 
{
	System.out.println("The real impmentation_ login");
}


void logout() 
{
	System.out.println("The real impmentation_ logout");
	
}
}
