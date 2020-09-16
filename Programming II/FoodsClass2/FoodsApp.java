import java.util.Scanner;
public class FoodsApp
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner (System.in);
      
      int quantity = 0;
      double price = 0.0;
      String name = null;
      double totalPrice = 0.0;
      int totalFood = 0;
      int i = 0;
      
      System.out.println("Please enter total number of foods: ");
      totalFood = input.nextInt();
      Foods [] arrFood = new Foods[totalFood];
      
       for(i=0; i<arrFood.length; i++)
       {
         System.out.println("Enter food name " + (i+1) +" : ");
         name = input.next();
         arrFood[i] = new Foods();
         arrFood[i].setName(name);
         
         System.out.println("Enter "+name+" price: ");
         price = input.nextDouble();
         arrFood[i].setPrice(price);
            
         System.out.println("Enter "+name+" quantity: ");
         quantity = input.nextInt();
         arrFood[i].setQuantity(quantity);
       }
      
      for(i=0; i<arrFood.length; i++)
      {
         System.out.println(arrFood[i].getName()+" is "+arrFood[i].getPrice()+" dollars.");
         
         totalPrice = totalPrice+arrFood[i].getPrice();
            
         System.out.println("Current total: "+totalPrice);  
      }
      
      System.out.println();
      
      for(i=arrFood.length-1; i>=0; i--)
      {
         System.out.println(arrFood[i].getName()+" "+arrFood[i].getPrice()+" "+
                            arrFood[i].getQuantity());     
      }
                
    }
}