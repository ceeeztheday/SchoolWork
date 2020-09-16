public class Eliminate
{
   public static void main (String[] args)
   {
      String str = "abcdefgh";
      char c1 = 'a';
      char c2 = 'd';
      char c3 = 'g';
      String str1 = c1+"";
      String str2 = c2+"";
      String str3 = c3+"";
      
      
      
      str = str.replaceAll(str1, "");
      str = str.replaceAll(str2, "");
      str = str.replaceAll(str3, "");
      
      System.out.println(str);
   
   }
}
