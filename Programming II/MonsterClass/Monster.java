public abstract class Monster implements VideoGameCharacter
{
   private String name;
   
   public Monster(String name)
   {
      this.name = name;
   }
   
   public String getName() 
   {
      return(name);
   }
}