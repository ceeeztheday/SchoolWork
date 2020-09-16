import java.util.InputMismatchException;
import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class PersonData
{
   public static void main(String[]args)
   {
     try
     {
        Scanner fScanner = new Scanner (new File("Person.txt"));
        while(fScanner.hasNextLine());
        {
            String firstName = fScanner.next();
            String lastName = fScanner.next();
            int id = fScanner.nextInt();
            System.out.println(firstName+" "+lastName+" "+id);
            
         
           
        }
     }
     
     catch(FileNotFoundException e)
     {
         System.out.println("Error:");
     }
     
     catch(InputMismatchException i)
     {
         System.out.println("Error: " + i);
     }
 
   }
}