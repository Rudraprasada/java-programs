//AUTOMATION BATCH - 51, ASSIGNMENTS -80;

package basicprg;

import java.util.Arrays;

public class ArrayProgram 
{
public static void main(String[] args) 
{
int[]age=new int[4];
age[0]=25;
age[2]=56;
age[1]=45;
age[3]=65;
Arrays.sort(age);
System.out.println(Arrays.toString(age));
}
}
