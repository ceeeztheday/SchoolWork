import java.util.Scanner;
public class Triangle
{
   public static void main(String[]args)
   {
      //var
      Scanner input = new Scanner(System.in);
      int row = 0;
      int col = 0;
      int i = 0; 
      int n = 0;
      
      //user prompt
      System.out.print("Please enter a positive number: ");
      n= input.nextInt();
      
            
      //logic loop
      for(row = 0; row < n; row++)
      {  
         
         i++;
         
         for(col = 0; col < i; col++)
         {
            System.out.print(i);
         }
         System.out.println();
       }
       
    }
 }
 

   
