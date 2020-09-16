public class RectangleApp
{
   public static void main(String [] args)
   {
      //instantiate two Rectangle objects
      Rectangle r1 = new Rectangle();   //no-arg constructor
      Rectangle r2 = new Rectangle(6.3, 3.2); //two-arg constructor
      
      System.out.println("r1 length is " + r1.getLength());
      r1.setLength(5);
      System.out.println("r1 length is " + r1.getLength());
      
      System.out.println(r2.toString());
      
   }
}