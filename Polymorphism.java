//AUTOMATION BATCH - 51, ASSIGNMENTS -117;

package basicprg;
class Google
{
	 void login()  
	 {
		System.out.println("Login in gmail using mobile no");
	}
}
public class Polymorphism extends Google
{
	  void login()
		{
			
		System.out.println("Login in gmail using Email id");
		super.login();
		}
	 public static void main(String[] args)
	 {
		/*  Polymorphism  p1=new Polymorphism();	
			p1.login(); */
		 Google g1=new Google();
		 g1.login();
	}
}
