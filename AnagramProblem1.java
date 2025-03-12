//AUTOMATION BATCH - 51, ASSIGNMENTS -82;

package basicprg;

import java.util.Arrays;

public class AnagramProblem1 {
public static void main(String[] args) 
{
String s1="cat";
String s2="act";

if(s1.length()!=s2.length())
{
	System.out.println("They are not anagram");
}
else
{
    System.out.println("Lets find out if They are anagram");
    char c1[]= s1.toCharArray();
    char c2[]= s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    boolean b1=Arrays.equals(c1, c2);
    System.out.println(b1);
    if(b1==true)
    {
    	System.out.println("It is an anagram");
    }
    else
    {
    	System.out.println("It is not anagram");
    }
}
}
}
