public class EliminateString2
{
   public static void main (String[] args)
   {
      String str = "mary mary quite";
      char c1 = 'y';
      char c2 = ' ';
      char c3 = 'q';
      
      String newString = "";
      int i = 0;
      
      for(i=0; i<str.length(); i++)
      {
         if(str.charAt(i) == c1 || str.charAt(i) == c2 || str.charAt(i) == c3)
         {
         //nothing
         }
         else
         {
            newString = newString + str.charAt(i);
         }
      }
            
      System.out.println(newString);
   
   }
}
