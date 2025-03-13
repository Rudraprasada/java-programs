//AUTOMATION BATCH - 51, ASSIGNMENTS -38;

package basicprg;
class parent_class
{
	static void add()
	{
		int a=120;
		int b=65;
				int sum=a+b;
				System.out.println(sum);
				
	}
}

public class Student_class extends  parent_class
{
static void sub()
{
	int a=120;
	int b=65;
			int sub=a-b;
			System.out.println(sub);
			
}
public static void main(String[] args)
{
	add();
	sub();
}
}
