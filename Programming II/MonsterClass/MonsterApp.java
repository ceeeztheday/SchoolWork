public class MonsterApp
{
   public static void main(String [] args)
   {
      Dragon fred = new Dragon("Fred", "Red");
      System.out.println(fred.getColor());
      fred.attack();
   }
}