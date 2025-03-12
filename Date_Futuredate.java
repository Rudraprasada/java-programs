//AUTOMATION BATCH - 51, ASSIGNMENTS -85;

package basicprg;

import java.util.Date;

public class Date_Futuredate {
public static void main(String[] args)
{
       Date d1=new Date();
       System.out.println(d1);
       Date d2=new Date(d1.getTime()) ;
       System.out.println(d2);
       Date d3=new Date(d1.getTime()-(1000*60*60*24*4)) ;
       System.out.println(d3);
       Date d4=new Date(d1.getTime()+(1000*60*60*24*4)) ;
       System.out.println(d4);
       
       String format1=d2.toString();
       // DD-MM-YYYY
       // DD/MM/YYYY
       
       String month= format1.substring(4, 7);
       System.out.println(month);
       String date= format1.substring(8, 10);
       System.out.println(date);
       String year= format1.substring(format1.length()-4);
       System.out.println(year);
       
       String format2=date.concat("-").concat(month).concat("-").concat(year);

       System.out.println(format2);

       String format3=date.concat("/").concat (month).concat("/").concat(year);

     

       System.out.println(format3);
}     
}
