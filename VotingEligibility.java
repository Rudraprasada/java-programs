//AUTOMATION BATCH - 51, ASSIGNMENTS -10;

package basicprg;
public class VotingEligibility 
{
	public static void main(String[] args)
	{
		int age=19;
		char gender='F';
		if(age>=18 & gender=='f')
		{
			System.out.println("you can vote");
	}
	else{
		if(age<=18 & gender=='f' )
		System.out.println("you cant't vote");
	}
	}
	
}
