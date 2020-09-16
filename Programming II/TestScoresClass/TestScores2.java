import java.util.*;
import java.io.*;
import java.math.*;
public class TestScores2
{
   public static void main(String[]args) 
   { 
      int count4 = 0;
      int count5 = 0;
      BigDecimal bdSum = new BigDecimal("0.0");
      BigDecimal bdAve = new BigDecimal("0.0");
      BigDecimal bdCount = new BigDecimal("0.0");
      
     try
     {
         Scanner fScanner = new Scanner(new File("scores.txt"));
         
         while(fScanner.hasNextLine())
         {                        
            String [] scores = fScanner.nextLine().split(" ");
             if(scores.length==4)
                  count4++;
             else
                  count5++;
         }
        
         System.out.println(count4+" students have four test scores.");
         System.out.println(count5+" students have five test scores.");
          System.out.println();
          
         Scanner f1Scanner = new Scanner(new File("scores.txt")); 
         while(f1Scanner.hasNextLine())
         { 
            String [] scores = f1Scanner.nextLine().split(" ");
              
            bdSum = new BigDecimal("0");
            bdCount = new BigDecimal("0");

                       
            for(String s : scores)
            {
               bdSum = bdSum.add(new BigDecimal(s));
               bdCount = bdCount.add(new BigDecimal("1"));  
            }
              
            bdAve = bdSum.divide(bdCount);
            System.out.println("The average is: "+ bdAve); 
          }   
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