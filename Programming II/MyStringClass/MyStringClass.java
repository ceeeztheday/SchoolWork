public class MyStringClass
{
   public static int alphaCount(String s)
   {
      /*The method receives a parameter “s” of type String.
      The method returns the number of alpha characters (the letters 'a' through 'z') 
      in String “s”. The method counts both upper and lower case alpha letters.
      Note: the string may contain any character including lower upper case letters, digits, spaces 
      and special characters.
      Note: this method may not use any String methods other than length( ) and charAt( ) */
      
      int count = 0, i;
      
      for(i = 0; i < s.length(); i++)
         if(s.charAt(i) >= 65 && s.charAt(i) <= 90 ||
            s.charAt(i) >= 97 && s.charAt(i) <= 122)
            count++;
                  
      return(count);
      
   }
   public static int digitCount(String s)
   {
      /*The method receives a parameter “s” of type String.
      The method returns the number of digit (the numbers '0' through '9') characters in String “s”.
      Note: this method may not use any String methods other than length( ) and charAt( )*/
      
      int count = 0, i;
      
      for(i = 0; i < s.length(); i++)
          if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
             count++;
 
      return(count);
   }
   public static int spaceCount(String s)
   {  
      /*The method receives a parameter “s” of type String.
      The method returns the number of space (‘ ‘) characters in String “s”.
      Note: this method may not use any String methods other than length( ) and charAt( )*/
      
      int count = 0, i;
      
      for(i = 0; i < s.length(); i++)
          if(s.charAt(i) == 32)
             count++;
      
      return(count);
   }
   public static int upperAlphaCount(String s)
   {
      /*The method receives a parameter “s” of type String.
      The method returns the number of uppercase ('A' to 'Z', inclusive) characters in String “s”.
      Note: this method may not use any String methods other than length( ) and charAt( )*/
      
      int count = 0, i;
      
      for(i = 0; i < s.length(); i++)
          if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
             count++;

      return(count);
   }
   public static int lowerAlphaCount(String s)
   {
      /*The method receives a parameter “s” of type String.
      The method returns the number of lowercase ('a' to 'z', inclusive) characters in String “s”.
      Note: this method may not use any String methods other than length( ) and charAt( )*/
      
      int count = 0, i;
      
      for(i = 0; i < s.length(); i++)
          if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
          count++;

      return(count);
   }
   public static boolean isPresent(String s, char c)
   {   
      /*The method receives two parameters,  s of type String and c of type char.
      The method returns true if the character represented by the variable c exists in String s.
      Otherwise, the method returns false if the character stored in c is not in String s. 
      Note: this method may not use any String methods other than length( ) and charAt( )*/
      
      int i;
      boolean present = false;
      
      for(i = 0; i < s.length(); i++)
      {    
         if(s.charAt(i) ==  c)
             present = true;
      }
      return(present);
   }
   public static int occurrences(String s, char c)
   {   
      /*The method receives two parameters,  s of type String and c of type char.
      The method returns an integer representing the number of times the character represented 
      by the variable c appears in String s.
      Note: this method may not use any String methods other than length( ) and charAt( )*/
      
      int count = 0, i;
      boolean present = false;
      
      for(i = 0; i < s.length(); i++)
      {    
         if(s.charAt(i) ==  c)
             count++;
      }
      return(count);
   }
   public static boolean isPalindrome(String str)
   {
      /*The method receives one parameter, a single String.
      The method returns true if the String is a palindrome, otherwise the
      method returns false.
      A palindrome is a String that spells the same word if it is read from
      the first character to the last, or from the last character to the first.*/
      
      boolean isPalin = false;
      int j = 0;
      int i = 0;
      int count = 0;
      j = str.length()-1; 
   
      for(i = 0; i<str.length(); i++)
      { 
         if(str.charAt(j) == str.charAt(i))
         {
            count++;
         }
         j--;  
      }
      
      if(count == str.length())
         isPalin = true;

      return(isPalin);
   }
}