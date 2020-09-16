public class App 
{
   public static void main(String [] args)
   {
      Triangle t = new Triangle("blue", 5, 6, 7);
      System.out.println("perimeter: " + t.findPerimeter());
      System.out.println("side2: " + t.getSide2());
      System.out.println("color: " + t.getColor());      
   }

}