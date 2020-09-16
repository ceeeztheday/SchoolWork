public class Bee extends Insect
{ 
   private int speed; 
   public static String sound = "buzz";

   public Bee(String n, int b, int d)
   { 
      super(n, b);
      System.out.println("To be " + sound); 
      this.speed = d; 
      sound += n.charAt(0);
   }

   public Bee()
   {
      System.out.println(this.speed);
      String s = woot();
      System.out.println(s);
   }

   public void gee(Object obj)
   {
      System.out.println("Bee"); 
      super.gee(obj); 
      String s = woot();
      System.out.println(s);
   }

}