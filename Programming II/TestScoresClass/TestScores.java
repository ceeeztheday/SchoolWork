import java.util.*;
import java.io.*;
import java.math.*;
public class TestScores
{
   public static void main(String[]args) 
   { 
      int count4 = 0;
      int count5 = 0;
      int count = 0;
      BigDecimal bdSum = new BigDecimal("0.0");
      BigDecimal bdAve = new BigDecimal("0.0");
      BigDecimal bdCount = new BigDecimal("0.0");
      
     try
     {
         Scanner fScanner = new Scanner(new File("scores.txt"));
         while(fScanner.hasNextLine())
         {
            
            bdSum = new BigDecimal("0");
            count = 0;
            bdCount = new BigDecimal("0");
            
            String [] scores = fScanner.nextLine().split(" ");
            
                       
            for(String s : scores)
            {
               bdSum = bdSum.add(new BigDecimal(s));
               bdCount = bdCount.add(new BigDecimal("1"));
               count++;
            }
            
              if(count == 5)
              {
                  count5++;
              }
              else
              {
                  count4++;
              }              
               
            bdAve = bdSum.divide(bdCount);
            System.out.println("The average is: "+ bdAve);
            
          }
          System.out.println(count4+" students have four test scores.");
          System.out.println(count5+" students have five test scores.");           
         
      
         
     }   
             
     
     catch(InputMismatchException i)
     {
         System.out.println("Error: " + i);
     }
     catch(FileNotFoundException w)
     {
         System.out.println("Error:");
     }

   }
}