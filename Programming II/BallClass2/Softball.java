public class Softball extends Baseball
{
   public static int items = 3;
   
   public Softball()
   {
      super();
      System.out.println("Softball " +
      "constructor.");
      items++;
   }
   
   public Softball(int items)
   {
      Softball.items = items;
   }
   
   @Override
   public String toString()
   {
      
      return("Items = " + items);
   }
}