//AUTOMATION BATCH - 51, ASSIGNMENTS -119;

package basicprg;
class Encapprogram
{
	private String emailid="contact@grotechminds.com";

	public String getEmailid() //get/fetching the value
	{
		return emailid;
	}

	public void setEmailid(String emailid) //set the value
	{
		this.emailid = emailid;
	}
	
}
public class Encapsulation
{
public static void main(String[] args)
{
	Encapprogram e1=new Encapprogram();
	e1.setEmailid("stbymkt@gmail.com");
	System.out.println(e1.getEmailid());
}
}
