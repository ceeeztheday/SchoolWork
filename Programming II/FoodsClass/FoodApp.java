public class FoodApp
{
   public static void main(String[] args)
   {
      Food f1 = new Food("Chicken");
      Food f2 = new Vegetable("Squash", 300, 25);
      f1.norf();
      f2.norf();
      
      Food f3 = new Food("Corn", 300);
      f3.norf();
      Vegetable v1 = new Vegetable("Kale", 300, 25);
      v1.norf();
      
      System.out.println(f3.bar(f2));
      System.out.println(f2.bar(f3));
      System.out.println(v1.bar(f2));
   }
}