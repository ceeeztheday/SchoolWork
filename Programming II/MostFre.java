
public class MostFre
{
   public static void main(String[] args)
   {
      String str = "banana";
      String str1 = "g8ueixbo927";
      String str2 = "brookkeeps";
      System.out.println(mostFrequentChar(str));
      System.out.println(mostFrequentChar(str1));
      System.out.println(mostFrequentChar(str2));
   }
           
   public static char mostFrequentChar(String s)
   {
      int i = 0;
      char result = ' ';
      String temp = null;
      int length = 0;
      int finalLength = 0;
     
      
      for(i=0; i<s.length(); i++)
      {
         temp = s.replace(s.charAt(i)+"","");
         
         length = s.length()-temp.length();
         
         if(length>finalLength)
         {
            finalLength=length;
            result=s.charAt(i);
         }
         
      }
      return(result);
   }
}