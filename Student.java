//AUTOMATION BATCH - 51, ASSIGNMENTS -52;

package basicprg;
interface Student1
{
	void stringname();
	void stringadd();
}
interface Student2 extends Student1
{
	void stringclass();
	void charsec();
}
public class Student implements  Student2
{
public static void main(String[] args)
{
	 Student s1=new  Student();
	 s1.stringname();
	 s1. stringadd();
	 s1. stringclass();
		s1. charsec();
}

public void stringname()
{
	System.out.println(" MARCO");
	
}

public void stringadd()
{
	System.out.println(" odisha");
}

public void stringclass() 
{
	System.out.println("v");
}

public void charsec() 
{

	System.out.println('c');
}
}
