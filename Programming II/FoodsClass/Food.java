public class Food
{
   public static String vit;
   private String name;
   private int cals;
   
   public Food(String n)
   {
      this(n, 0);
      System.out.println(vit);
   }
   
   public Food(String n, int c)
   {
      this.name = n;
      this.cals = c;
      vit += n.charAt(0);
      System.out.println(vit);
   }
   
   public void norf()
   {
   System.out.println(this.name + " " + this.cals);
   }
   
   public int bar(Object o)
   {
      System.out.println("Food!");
      int boo = 5;
      
      if (!(o.getClass().equals(this.getClass())))
         boo -= 4;
      else
      {
         Food f = (Food) o;
         boo = f.cals - this.cals;
      }
      return boo;
   }
}