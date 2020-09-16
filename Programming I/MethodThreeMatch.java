import java.util.Scanner;
public class MethodThreeMatch
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int a, b, c, d;
      boolean match;
      
      System.out.println("Please enter four integers: ");
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();
      d = input.nextInt();
      
      match = atLeastThreeMatch(a, b, c, d);
      System.out.println("At least three match: "+ match);
   }
   public static boolean atLeastThreeMatch( int a, int b, int c, int d)
   {
      if(a!=b&&b==c&&c==d)
         return(true);
      else if(b!=a&&a==c&&c==d)
         return(true);
      else if(c!=a&&a==b&&b==d)
         return(true);
      else if(d!=a&&a==b&&b==c)
         return(true);
      else if(a==b&&b==c&&c==d)
         return(true);   
      else
         return(false);
   }
}
     
      
   
      