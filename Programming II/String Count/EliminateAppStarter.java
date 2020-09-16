public class EliminateAppStarter
{
   public static void main(String [] args)
   {
      String str1 = "abcdefgh";
      String str2 = "mary mary quite";
      
      String result = "";
      
      System.out.println("\nUsing eliminate: ");
      
      result = eliminate(str1, 'a', 'd', 'g');
      System.out.println("\n" + str1 + " is now " + result);
      
      result = eliminate(str2, 'y', ' ', 'q');
      System.out.println("\n" + str2 + " is now " + result);
      
      System.out.println("\nUsing eliminate2: ");
      
      result = eliminate2(str1, 'a', 'd', 'g');
      System.out.println("\n" + str1 + " is now " + result);
      
      result = eliminate2(str2, 'y', ' ', 'q');
      System.out.println("\n" + str2 + " is now " + result);
      
   }
   public static String eliminate(String str, char c1, char c2, char c3)
   {
      String c = String .valueOf(c1);
      str = str.replace(c, "");
      str = str.replace(String.valueOf(c2), "");
      str = str.replace(Character.toString(c3), "");
      
      return(str);
   }
   public static String eliminate2(String str, char c1, char c2, char c3)
   {
      str = str.replace(c1 + "", "");
      str = str.replace(c2 + "", "");
      str = str.replace(c3 + "", "");
      
      return(str);
   }

}