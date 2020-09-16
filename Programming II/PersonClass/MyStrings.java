public class MyStrings
{
   public static void main(String []args)
   {
      String name = "Marcia";
      int x = 345;
      String str = "otto";
      String car = "racecar";
      String me = "Robert";
      
      boolean palin = false;
      
      palin = isPalindrome(name);
      System.out.println(palin);

      palin = isPalindrome(str);
      System.out.println(palin);

      
      palin = isPalindrome(car);
      System.out.println(palin);
      
      palin = isPalindrome(me);
      System.out.println(palin); 
      
            
     // System.out.println('7'+'5');
      //System.out.println('a'+'b');
      //System.out.println('a'+98);
      
     // System.out.println(str.charAt(1));
      
   
   }
   
   public static boolean isPalindrome (String s)
   {
      boolean isPalin = false;
      int j = 0;
      int i = 0;
      int count = 0;
      j = s.length()-1; 
   
      for(i = 0; i<s.length(); i++)
      { 
         
          
         
            if(s.charAt(j) == s.charAt(i))
            {
               count++;
            }
            
             j--;  
               
               
         
         
      }
      
      if(count == s.length())
         isPalin = true;
         
               
      return(isPalin);
          
   }
   
}