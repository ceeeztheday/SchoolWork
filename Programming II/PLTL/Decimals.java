public class Decimals
{
   public static void printDecimalDigits(double d)
   {  
       String str = d + " ";
       int a = str.indexOf(".");
       
       if(a!=-1)
       {
         str= str.substring(a+1,str.length());
       }
       else
       {
         str= 0+"";
       }
       System.out.println(str);     
   }
   
}