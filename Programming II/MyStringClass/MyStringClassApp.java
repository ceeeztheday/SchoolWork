public class MyStringClassApp
{
   public static void main(String [] args)
   {
      MyStringClass msc = null;  //assigning null so compiler will not generate a warning
      int count = 0;
      boolean isPresent = false, isPalindrome = false;
      
      String str =  "1) I am enough of an artist to draw freely upon my imagination. " +
                    "2) Imagination is more important than knowledge. " +
                    "3) Knowledge is limited. " +
                    "4) Imagination encircles the world. " + 
                    "5) ― Albert Einstein";
                    
      //ALPHA COUNT
      count = MyStringClass.alphaCount(str); //uses fully qualified name to call static method
      System.out.println(count);
      
      count = msc.alphaCount(str);  //uses reference variable to call static method
      System.out.println(count);
      
      //DIGIT COUNT     
      count = msc.digitCount(str);  //uses reference variable to call static method
      System.out.println(count);
      
      //SPACE COUNT     
      count = msc.spaceCount(str);  //uses reference variable to call static method
      System.out.println(count);
      
      //UPPER ALPHA COUNT     
      count = msc.upperAlphaCount(str);  //uses reference variable to call static method
      System.out.println(count);
      
      //LOWER ALPHA COUNT     
      count = msc.lowerAlphaCount(str);  //uses reference variable to call static method
      System.out.println(count);
      
      //IS PRESENT     
      isPresent = msc.isPresent(str, 'E');  //uses reference variable to call static method
      System.out.println(isPresent);
      
      //OCCURRENCES     
      count = msc.occurrences(str, 's');  //uses reference variable to call static method
      System.out.println(count);
      
      //IS PALINDROME     
      isPalindrome = msc.isPalindrome(str);  //uses reference variable to call static method
      System.out.println(isPalindrome);
      
      //IS PALINDROME     
      isPalindrome = msc.isPalindrome("a toyota");  //uses reference variable to call static method
      System.out.println(isPalindrome);
      
   }
}