public class Plane
{

   private String name;
   private int callNumber;
   
   public Plane(String n)
   {
      this(n, 000);
   }
   
   public Plane(String n, int identifier)
   {
      name = n;
      callNumber = identifier;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getCallNumber()
   {
      return callNumber;
   }
   
   public void setCallNumber(int cn)
   {
      callNumber = cn;
   } 
    
   public String toString()
   {
      displayProperties();
      return "Plane: " + name;
   }
   
   public void displayProperties()
   {
      System.out.println("One Classy Plane");
   }
}