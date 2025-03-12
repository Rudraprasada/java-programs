//AUTOMATION BATCH - 51, ASSIGNMENTS -84;
package basicprg;
public class Allthe_StrinG_Function {
public static void main(String[] args) 
{
String name="school name is abc";
String n1=name.replace('m', 'a');  //Replase 
System.out.println(n1);

     String name1="school name is abc";
     String n2=name.replaceAll("abc", "DAV");
     System.out.println(n2);
     
     String name2="Rudra Prasada Nohapatra";
     String n3=name2.replaceAll("[A-Z]", "");  //replaceAll
     System.out.println(n3); 
     
     String name3="Rudra 06589 Nohapatra";
	String n4=name3.replaceAll("[0-9]", "z");
     System.out.println(n4);  
 
     String input="MARCO";
     String s1=input.repeat(4); //Repeat
     System.out.println(s1);  
     
     String input1="my name is rudra";
     String s2=input1.substring(5);  //SUBSTRING
     System.out.println(s2);  
     
     String input3="my name is rudra";
     String s3=input3.substring(1, 2) ;//SUBSTRING
     System.out.println(s3);  
     
 String a= "abhi";
  boolean b1=           a.matches("....");  //matches
  System.out.println(b1);
  //String end with n
  boolean b2=           a.matches("(.)*n");  //matches
  System.out.println(b2);
  //staring with a or not
  boolean b3=           a.matches("a(.)*");  //matches
  System.out.println(b3);
  //chesk if the given string have man in it
  boolean b4=           a.matches("(.)*man(.)*");  //matches
  System.out.println(b4);
  
  
}
}
