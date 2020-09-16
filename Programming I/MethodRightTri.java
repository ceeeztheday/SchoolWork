import java.util.Scanner;
public class MethodRightTri
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
     
      
      tri = isRightTri(a, b, c);
      System.out.println(tri);
    }
    public static boolean isRightTri(int a, int b, int c)
    {
      if(a<=0 || b<=0 || c<=0) 
         return(false);
      else if(a*a==c*c+b*b || b*b==c*c+a*a 
               || c*c==a*a+b*b) 
         return(true);
      else
         return(false);
    }
}
      
