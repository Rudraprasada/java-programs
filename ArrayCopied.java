//AUTOMATION BATCH - 51, ASSIGNMENTS -78;

package basicprg;

import java.util.Arrays;

public class ArrayCopied {
public static void main(String[] args) 
{
int array1[]=new int[4];
array1[0]=45;
array1[1]=75;
array1[2]=55;
array1[3]=65;

int array2[]=new int[array1.length];

		for(int i=0;i<array1.length;i++)
		{
			array2[i]=array1[i];
		}
		System.out.println("input array:->"+Arrays.toString(array1));
		System.out.println("copied array:->"+Arrays.toString(array2));
		
}
}
