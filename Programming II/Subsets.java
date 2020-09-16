public class Subsets
{
   public static void main (String [] args)
   {
      String str1 = "hello, john. john, where did you get the name john? does anyone call you johnny?";
      String str2 = "john";
      String str3 = "hello, john. john, john? may i call you johnny?";
      String str4 = "johnny";
      String str5 = "hello";
      String str6 = "bye";
      
   }
   public static int subsets(String s1, String s2)
   {
      String str7 = str1.replace(str2," ");
      
      System.out.println((str1.length() - str7.length())/(str2.length()));  
   }
}