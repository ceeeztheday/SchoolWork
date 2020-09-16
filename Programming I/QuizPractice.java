import java.util.Scanner;
public class QuizPractice
{
   public static void main(String[]args)
   {
      //var
      Scanner input= new Scanner(System.in);
      int i = 0;
      int n = 0;
      
      //creat array
      System.out.println("Please enter the number of elements you want to store: ");
      n = input.nextInt();
      int [] arr = new int [n];
      
      //load array
      for(i=0; i<arr.length; i++)
      {
         System.out.println("Enter integer " + (i+1) +":");
         arr [i] = input.nextInt();
      }
      
      //display array forward
      System.out.println("This is the array forward:");
      for(i=0; i<arr.length; i++)
      {
         System.out.print(arr [i]+"\t");
      }
      //array reverse
      System.out.println("This is the array in reverse");
      for(i=arr.length-1; i>=0; i--)
      {
         System.out.println(arr [i]);
      }

   }
}  