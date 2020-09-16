public class Strings
{
   public static void main(String [] args)
   {

      //STRING SEARCHING: substring( )
      String originalString = "This is the original String";
      System.out.println(originalString.substring(0, originalString.length()));
      System.out.println(originalString.substring(0, 20));
      System.out.println(originalString.substring(0, 12)); 
      
      //INTEGER WRAPPER CLASS
      String one = "2";
      String two = "2";
      int result = Integer.parseInt(one) + Integer.parseInt(two);
      System.out.println(result);
      
      //REPLACE
      String s  = "I love python. I love python. I love python";
      System.out.println(s);
      String q = s.replace('p', 'P');
      System.out.println(q);
      System.out.println(q.replace("Python", "Java"));
   }
}


   
   