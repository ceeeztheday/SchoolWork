import java.text.DecimalFormat;
import java.util.Scanner;
   public class ElapsedTime
   {
      public static void main(String [] args)
      {
      Scanner input = new Scanner(System.in);
      DecimalFormat formatter = new DecimalFormat("#0.00");
		
      //Prompt user to enter miles
      System.out.println("Enter number of miles traveled: ");
      
      double miles = input.nextDouble();
     
      //Prompt user to enter speed
      System.out.println("Enter the average speed: ");
      
      double speed = input.nextDouble();
      double elapsedTime = miles / speed;
   
      //Display
      System.out.println("The elapsed time on your trip was: " + 
      formatter.format(elapsedTime) + 
      "hrs");
   }
}
/*
Enter number of miles traveled: 
 183.67
 Enter the average speed: 
 58
 The elapsed time on your trip was: 3.17hrs
Enter number of miles traveled: 
 5803
 Enter the average speed: 
 80
 The elapsed time on your trip was: 72.54hrs
Enter number of miles traveled: 
 300.89
 Enter the average speed: 
 90
 The elapsed time on your trip was: 3.34hrs
Enter number of miles traveled: 
 102.67
 Enter the average speed: 
 66.5
 The elapsed time on your trip was: 1.54hrs*/