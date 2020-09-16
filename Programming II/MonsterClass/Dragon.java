public class Dragon extends Monster
{
   private String color;
   
   public Dragon (String name, String color)
   {
      super(name);
      this.color= color;
   }
   
   public String getColor()
   {
      return(this.color);
   }
   @Override
   public String getName()
   {
      return(super.getName());
   }
   
   @Override
   public void attack()
   {
      System.out.println(this.getName()+" "+this.getColor()+" "+"Dragon breaths fire");
   }
}