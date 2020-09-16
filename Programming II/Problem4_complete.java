import java.util.Scanner;
import java.text.NumberFormat;
import java.math.*; //imports enumerations and java.math classes
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Problem4_complete
{
   public static void main(String [] args)
   {
    //variable declarations
      String fName = "course_exam_scores_simple.txt";
      int count4 = 0;
      int count5 = 0;
      BigDecimal bdSum = new BigDecimal("0");
      BigDecimal bdAverage = new BigDecimal("0");
      BigDecimal bdTemp;
      BigDecimal zero = new BigDecimal("0");
      String [] s;
      String str;
      
      try
      {
    	   //create a scanner object that reads data from a text file
    	   Scanner fScanner = new Scanner(new File(fName));
    	  
	      while(fScanner.hasNextLine())
	      {
	         str = fScanner.nextLine();
            s = str.split(" ");
            
            bdTemp = new BigDecimal(s[0]);
            
            for(int i = 0; i < s.length; i++)
            {
               bdTemp = new BigDecimal(s[i]);
               System.out.println("bdTemp = " + bdTemp);
               bdSum = bdSum.add(bdTemp);
            } 
               
            System.out.println("bdSum = " + bdSum);
            bdSum = zero;  
	      }
      }
      catch(Exception e)
      {
    	  System.out.println("In catch, exception message = " + e);
      }  
   }
}