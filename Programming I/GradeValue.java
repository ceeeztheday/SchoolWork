import java.util.Scanner;
public class GradeValue
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int grade;
      boolean pass;
   
      System.out.println("Please enter a percentage grade: ");
      grade = input.nextInt();
      
      pass = isPassing(grade);
      System.out.println(grade + " is passing: " + pass);
   }
   public static boolean isPassing(int grade)
   {
      if(grade>=70)
         return(true);
      else
         return(false);
   }
}
      
      
    