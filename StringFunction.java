//AUTOMATION BATCH - 51, ASSIGNMENTS -68;

package basicprg;

public class StringFunction 
{
public static void main(String[] args)
{
  String a="Rudra prasad mohapatra";
      boolean b1=  a.contains("raddy");
      boolean b2=  a.contains("mohapatra");
      System.out.println(b1);
      System.out.println(b2);
      
      String b="Rudra";
     System.out.println( b.concat(" prasad mohapatra"));
     String i1="students";
     String i2="are";
     String i3="good";
     System.out.println(i1.concat(" ").concat(i2).concat(" ").concat(i3));
}
}
