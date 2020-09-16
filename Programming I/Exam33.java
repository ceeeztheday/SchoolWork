import java.util.Scanner;
public class Exam33
{
   public static void main(String[]args)
   {
     
      double a = 0;
      double b = 0;
      double c = 0;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter Int:");
      a=input.nextDouble();
      
      System.out.println("Enter Int:");
      b=input.nextDouble();
      
      System.out.println("Enter Int:");
      c=input.nextDouble();
      
      if(a>b&&b>c)
         System.out.println("DOWN");
      else if(a<b&&b<c)
         System.out.println("UP");
         
      else
        System.out.println("Neither");
    }
    }

         
         
         