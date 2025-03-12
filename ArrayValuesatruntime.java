//AUTOMATION BATCH - 51, ASSIGNMENTS -76;

package basicprg;

import java.util.Scanner;

public class ArrayValuesatruntime {
public static void main(String[] args) 
{
Scanner s1=new Scanner(System.in);
System.out.println("Please enter the size of your array");
int age[]=new int[s1.nextInt()];
for(int i=0;i<age.length;i++)
{
	System.out.println("Please enter the value at index "+i);
	   age[i]=s1.nextInt();
}
}
}
