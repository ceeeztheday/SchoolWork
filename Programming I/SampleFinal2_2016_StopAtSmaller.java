/*
program that prompts the user to enter integers from the keyboard one at a time. 
The program stops reading integers the first time an integer entered is smaller than the previous integer entered. 
The program then displays the last two integers entered.
*/

import java.util.Scanner;

public class SampleFinal2_2016_StopAtSmaller
{
   public static void main(String [] args)
   {
      //variable declaration
      Scanner kbd = new Scanner(System.in);  //to read user input data in from keyboard
      int firstVal = 0;    //stores user initial value
      int secondVal = 0;   //stores subsequent values
      int count = 0;       //stores the number of integers entered.
      
      //data input: get first two values
      System.out.println("Please enter your first integer: ");
      firstVal = kbd.nextInt();
      count++;
      
      System.out.println("Please enter another integer: ");
      secondVal = kbd.nextInt();
      count++;
      
      while(firstVal < secondVal)
      {
         firstVal = secondVal;      //make the second value become the new first value
         System.out.println("Please enter another integer: ");
         secondVal = kbd.nextInt(); //get a new second value
         count++; 
      }

      System.out.println("\nYou entered " + count + " values.");
      System.out.println("The last one entered was: " + secondVal);
      System.out.println("The one before that was: " + firstVal);
   }
}