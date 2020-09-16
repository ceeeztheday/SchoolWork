import java.util.Scanner;
public class MethodMin
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int a, b, c, min;
      
      System.out.println("Please enter three integers: ");
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();
      
      min= minValue(a, b, c);
      System.out.println(min+ " is the smallest vaule");
    }
    public static int minValue(int x, int y, int z)
    {
      if(x<y && x<z)
         return(x);
      else if (y<x && y<z)
         return(y);
      else
         return(z);
    }
}
      
      
      
      
      