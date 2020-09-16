import java.util.Scanner;
   public class Temp
   {
      public static void main(String []args)
      {
      //Variables
      double fah;
      double cel;
      Scanner input = new Scanner(System.in);
      
      //User prompt
      System.out.println("Please enter a temperature in Fahrenheit: ");
      fah = input.nextInt();
      
      cel = 5 *( fah - 32 ) / 9;
          
      System.out.println(fah + " degrees Fahrenheit is " + cel + 
      " degrees Celsius.");

   }
}
