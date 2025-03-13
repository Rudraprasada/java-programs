//AUTOMATION BATCH - 51, ASSIGNMENTS -70;

package basicprg;

public class StringFunction_2 {
public static void main(String[] args)
{
String input="mango";
String reverse="";
for(int i=input.length()-1;i>=0;i--)
{
	char c1= input.charAt(i);
	reverse=reverse+c1;
	
}
System.out.println(reverse);
}
}
