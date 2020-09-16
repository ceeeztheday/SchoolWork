import java.util.Scanner;

public class FoodsHw1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double totalPrice = 0;
      int i = 0;
      int totalFood = 0;

      System.out.println("Please enter total number of foods: ");
      totalFood = input.nextInt();

      String[] arrName = new String[totalFood];
      double[] arrPrice = new double[totalFood];
      int[] arrQuantity = new int[totalFood];

      for (i = 0; i < arrName.length; i++) {
         System.out.println("Enter food name " + (i + 1) + " : ");
         arrName[i] = input.next();

         System.out.println("Enter " + arrName[i] + " price: ");
         arrPrice[i] = input.nextDouble();

         System.out.println("Enter " + arrName[i] + " quantity: ");
         arrQuantity[i] = input.nextInt();
      }

      for (i = 0; i < arrName.length; i++) {
         System.out.println(arrName[i] + " is " + arrPrice[i] + " dollars.");

         totalPrice = totalPrice + arrPrice[i];

         System.out.println("Current total: " + totalPrice);
      }

      System.out.println();

      for (i = arrName.length - 1; i >= 0; i--) {
         System.out.println(arrName[i] + " " + arrPrice[i] + " " + arrQuantity[i]);
      }
   }
}
