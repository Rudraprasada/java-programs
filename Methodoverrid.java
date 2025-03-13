//AUTOMATION BATCH - 51, ASSIGNMENTS -48;

package basicprg;
class Google_Auth
{
	 final void login()   // using final method
	{
		System.out.println("Login in gmail using mobile no");
	}
}
public class Methodoverrid extends Google_Auth
{
	 // void login()
	{
		  super.login();
		System.out.println("Login in gmail using Email id");
		
	}
	public static void main(String[] args) 
	{
		Methodoverrid  m1=new Methodoverrid();	
		m1.login();
		
	}
}
