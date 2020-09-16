public class MostFrequentCharPrepFile
{
   public static void main(String [] args)
   {
      String str = "banana";
      System.out.println(mostFrequentChar(str));
      System.out.println(mostFrequentCharAlt(str));
      System.out.println(mostFrequentCharASCII(str));
      System.out.println();
      
      System.out.println(mostFrequentChar("g8ueixbo927v"));
      System.out.println(mostFrequentCharAlt("g8ueixbo927v")); 
      System.out.println(mostFrequentCharASCII("g8ueixbo927v"));
      System.out.println(mostFrequentCharASCII("gfgfg"));
      System.out.println();
      
      System.out.println(mostFrequentChar("brookkeeps"));
      System.out.println(mostFrequentCharAlt("brookkeeps"));
      System.out.println(mostFrequentCharASCII("brookkeeps"));
      System.out.println(mostFrequentCharASCII("brookkeeps"));
   }
   
   public static char mostFrequentChar(String s)
   {

      char mostFrequent = s.charAt(i);
      
            return(mostFrequent);
   }
   
   public static char mostFrequentCharASCII(String s)
   {

      char mostFrequent = (char)121;//s.charAt(i);
      
     

      return((char)mostFrequent);
   }

   public static char mostFrequentCharAlt(String s)
   {
      
      char c = s.charAt(0);
      

      return c;
   }
}