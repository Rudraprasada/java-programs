//AUTOMATION BATCH - 51, ASSIGNMENTS -75;

package basicprg;

public class Average_no_array {
public static void main(String[] args) 
{
int []rollno1=new int[4];
rollno1[0]=10;
rollno1[1]=20;
rollno1[2]=36;
rollno1[3]=49;
double sum=0;
double average=0;
for(int i=0;i<=3;i++)
{
	sum=sum+rollno1[i];
}
System.out.println(sum);
average=sum/rollno1.length;
System.out.println(average);
}
}
