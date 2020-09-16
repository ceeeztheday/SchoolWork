public class Vegetable extends Food
{
   private int fiber;
   
   public Vegetable(String n, int c, int f)
   {
      super(n, c);
      this.fiber = f;
      Food.vit += f;
   }
   public int bar(Object o)
   {
      System.out.println("Veggie!");
      int boo = 3;
      
      if (!(o.getClass().equals(this.getClass())))
         boo = 6;
      else
      {
         Vegetable v = (Vegetable) o;
         int b1 = super.bar(v);
         int b2 = v.fiber - this.fiber;
         boo = b1 + b2;
      }
      return boo;
   }
}