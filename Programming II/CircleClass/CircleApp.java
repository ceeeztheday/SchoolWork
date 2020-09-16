public class CircleApp
{
   public static void main(String [] args)
   {
      //three circle objects
      Circle c1 = new Circle();
      Circle c2 = new Circle(10);
      Circle c3 = new Circle(15);
      
       //String toString 
      System.out.println("c1 data: \n"+c1.toString());
      System.out.println("c2 data: \n"+c2.toString());
      System.out.println("c3 data: \n"+c3.toString());

      //additional 3 circle objects
      Circle c4 = new Circle(4);
      Circle c5 = new Circle(20);
      Circle c6 = new Circle(3);
      
      //additional 3 tests
      System.out.println("c4 data: \n"+c4.toString());
      System.out.println("c5 data: \n"+c5.toString());
      System.out.println("c6 data: \n"+c6.toString());
      }

}