import java.util.Scanner;
public class MethodMax
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int a, b, c, max;
      
      System.out.println("Please enter three integers: ");
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();
      
      max= maxValue(a, b, c);
      System.out.println(max+ " is the max vaule");
    }
    public static int maxValue(int x, int y, int z)
    {
      if(x>y && x>z)
         return(x);
      else if (y>x && y>z)
         return(y);
      else
         return(z);
    }
}
      
      
      
      
      