//AUTOMATION BATCH - 51, ASSIGNMENTS -71;

package basicprg;

public class StringFunction_3 {
	public static void main(String[] args)
	{
	String input="ram";
	String reverse="";
	for(int i=input.length()-1;i>=0;i--)
	{
		char c1= input.charAt(i);
		reverse=reverse+c1;
		
	}
	System.out.println(reverse);
	if(input.contentEquals(reverse))
	{
		System.out.println("The given word is palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
	}
}
