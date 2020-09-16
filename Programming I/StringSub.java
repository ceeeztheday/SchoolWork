import java.util.Scanner;
   public class StringSub
   {
   public static void main(String[]args)
   {
   Scanner input = new Scanner(System.in);
   
   //Variables
   
   String animal;
   String food;
   String color;
   String friend;
   
   
   
   System.out.println("Enter Animal food color and friend: ");
   animal = input.next();
   food = input.next();
   color = input.next();
   friend = input.next();
   
   //Display
   System.out.println(food);
   System.out.println(animal);
   System.out.println(color);
   System.out.println(friend);
   




   
   }
}