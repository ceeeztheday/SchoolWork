import java.util.Scanner;
public class MethodPositive
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      boolean numb;
      int n;
   
      System.out.println("Please enter a positive or negative integer: ");
      n = input.nextInt();
   
      numb = isPos(n);
      System.out.print(n + " is a postive number: " + numb);
   }
   public static boolean isPos(int x)
   {
      if(x>=0)
         return(true);
      else
         return(false);
    }
}