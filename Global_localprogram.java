//AUTOMATION BATCH - 51, ASSIGNMENTS -46;

package basicprg;

public class Global_localprogram 
{
   String name;
   double salary;
   int age;
   void student_details(String name,double salary,int age)
   {
	   this.name=name;
	   this.salary=salary;
	   this.age=age;
	  System.out.println("Hi my name is->"+name);
	   System.out.println("Hi my salary is->"+salary);
	   System.out.println("Hi my age is->"+age);
   }
   public static void main(String[] args)
   {
	   Global_localprogram r1=new Global_localprogram ();
	 r1.student_details("marco",980000,24);

	 System.out.println(r1.name);
	 System.out.println(r1.salary);
	 System.out.println(r1.age);
} 
   
}
