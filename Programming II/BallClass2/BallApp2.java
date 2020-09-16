public class BallApp2
{
   public static void main(String[] args)
   {
      Softball a = new Softball();
      Ball[] b = { new Ball(), new Baseball(), a, new Baseball("hard ball") };
      System.out.println("b[1] = " + b[1] );
   }
}
   