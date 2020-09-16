public class InsectApp
{
   public static void main(String[] args)
   {
      Insect b1 = new Insect("ant", 3); 
      Bee b2 = new Bee("honey", 2, 5); 
      b1.gee(b2); 
      String s = b1.woot();
      String s1 = b2.woot(4); 
      System.out.println(s);
      System.out.println(s1); 
      Bee b3 = new Bee(); 
      b3.gee(b2);
      System.out.println(Bee.sound);
   }

}