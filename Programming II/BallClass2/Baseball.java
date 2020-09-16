public class Baseball extends Ball
{
   public static int fans = 9;
   private String name;
   
   public Baseball()
   {
      super();
      fans++;
      System.out.println("Bball constructor " +
      fans + " " +
      this.name);
   }
   
   public Baseball(String name)
   {
      this.name = name;
   }
   
   public void hit()
   {
      System.out.println("Tore cover off!");
      super.hit();
   }
   
  @Override
   public String toString()
   {
      return("fans = " + fans + " name = " +
      this.name);
   }
}