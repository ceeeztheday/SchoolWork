import java.util.Scanner;
public class MethodMid
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int a, b, c, mid;
      
      System.out.println("Please enter three integers: ");
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();
      
      mid= midValue(a, b, c);
      System.out.println(mid+ " is the middle vaule");
    }
    public static int midValue(int x, int y, int z)
    {
      if(x<y && y<z)
         return(y);
      else if(x>y && y>z)
         return(y);
      else if(y>x && x>z)
         return(x);
      else if(y<x && x<z)
         return(x);
      else
         return(z);
     }
}      
      
      
      
      