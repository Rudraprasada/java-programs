//AUTOMATION BATCH - 51, ASSIGNMENTS -16;
package basicprg;
public class Methodoverloading {
static void add(double a,int b)
{
	System.out.println("1");
}
static void add(int a)
{
	System.out.println("2");
}
static void add(int a,double c)
{
	System.out.println("3");
}
static void add(int a,int b)
{
	System.out.println("4");
}
void add(char a)
{
	System.out.println("5");
}
void add(char a,char b)
{
	System.out.println("6");
}
public static void main(String[] args) 
{
	add(45.333365,56);
	add(525);
	add(45,56.2365);
	add(4,5);
	Methodoverloading r=new Methodoverloading() ;
	r.add('m');
	r.add('m','f');
}
}
