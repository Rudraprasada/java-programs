//AUTOMATION BATCH - 51, ASSIGNMENTS -43;

package basicprg;
class Flipkart1
{
	Flipkart1(String un,String pwd)
	{
		System.out.println("This is parent constructer");
	}
}

public class Flipkart extends Flipkart1
{
	 Flipkart()
	 {
		 super("marco @ gmail.com","marco123");
		 
		 System.out.println("This is child constructer");
	 }
public static void main(String[] args)
{
	new  Flipkart()	;
	}
}
