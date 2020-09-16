import java.util.Scanner;
public class MethodsAbsolute
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int n;
      int abs;
     
      System.out.println("Please enter a negative or positive integer: ");
      n = input.nextInt();
      
      abs = absValue(n);
      System.out.println("The absolute value of " + n + " is " + abs);
   }
   public static int absValue( int x )
   {   
      if(x>= 0)
         return(x);
      else
        return(-x);
   } 
}
