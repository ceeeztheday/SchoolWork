import java.util.Scanner;
public class MethodRectangle
{
   public static void main(String [] args)
   {
      boolean rec = true;
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
      
      rec = isRectangle(s1, s2, s3, s4);
      System.out.print("Represents a rectangle : " + rec);
   }
   public static boolean isRectangle(int s1, int s2, int s3, int s4)
   {
      if(s1==s2&&s2==s3&&s3==s4) //square test first
         return(false);
      else if(s1==s2&&s3==s4)
         return(true);
      else if(s1==s3&&s2==s4)
         return(true);
      else if(s1==s4&&s2==s3)
         return(true);
      else
         return(false);
    }
}
        
   
      
      
