public class ReplaceTester
{
   public static void main (String [] args)
   {
      String s1 = "hello";
      String s2 = s1.replace("l", "");
      System.out.println(s1);
      System.out.println(s2);
      
      String s3 = "enchantment".replace("n","");
      System.out.println(s3);
      System.out.println("enchantment".length());
      System.out.println("enchantment".replace("n", "").length());
      
      s2 = s1.replaceAll("[h|l]", "");
      System.out.println(s1);
      System.out.println(s2);
      
      String s4 = "abcdefgh".replaceAll("[a|d|g]", "");
      System.out.println(s4);
      
      
   }
}