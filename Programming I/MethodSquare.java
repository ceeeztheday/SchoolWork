import java.util.Scanner;
public class MethodSquare
{
   public static void main(String [] args)
   {
      boolean sq = true;
      int s1; 
      int s2; 
      int s3;
      int s4;
      Scanner input = new Scanner(System.in);
      
      
      System.out.println("Please enter four integers: ");
      s1 = input.nextInt();
      s2 = input.nextInt();
      s3 = input.nextInt();
      s4 = input.nextInt();
      
      sq = isSquare(s1, s2, s3, s4);
      System.out.print("Represents a square : " + sq);
   }
   public static boolean isSquare(int s1, int s2, int s3, int s4)
   {
      if(s1==s2&&s2==s3&&s3==s4) 
         return(true);
      else 
         return(false);
    }
}
