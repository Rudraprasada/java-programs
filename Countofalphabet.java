//AUTOMATION BATCH - 51, ASSIGNMENTS -83 ;

package basicprg;

import java.util.Arrays;

public class Countofalphabet {
public static void main(String[] args) 
{
	 int count_of_alphabet=0;
	 int count_of_digit=0;
	 int count_of_space=0;
	 
String s1="rudra @ 56465";
char c1[]=s1.toCharArray();
System.out.println(Arrays.toString(c1));
for(int i=0;i<=c1.length-1;i++)
{
	       boolean b1= Character.isAlphabetic(c1[i]);
	       boolean b2=Character.isDigit(c1[i]);
	       boolean b3=Character.isWhitespace(c1[i]);
	       if(b1==true)
	       {
	    
			count_of_alphabet++;
	       }
	       if(b2==true)
	       {
	    	   count_of_digit++;
	       }
	       if(b3==true)
	       {
	    	   count_of_space++;
	       }
}

int countofspecialchar=s1.length()-(count_of_alphabet+count_of_digit+count_of_space);

System.out.println("Special char are->"+countofspecialchar);

System.out.println("Alphabets are->"+count_of_alphabet);
System.out.println("Digits are->"+count_of_digit);
System.out.println("Spaces are->"+count_of_space);
}
}
