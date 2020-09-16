import java.util.Scanner;
public class MethodTri
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int a, b, c;
      boolean tri;
      
      System.out.println("Please enter three integers: ");
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();
     
      
      tri = isTri(a, b, c);
      System.out.println(tri);
    }
    public static boolean isTri(int a, int b, int c)
    {
      if(a<=0 || b<=0 || c<=0) 
         return(false);
      else if(a>=b+c || b>=a+c || c>=a+b) 
         return(false);
      else 
         return(true);
     }
}
      
