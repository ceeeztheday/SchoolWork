public class CargoPlane extends Plane
{
   private String type;
   public CargoPlane()
   {
      super("Bravo", 239); //name, call number
      type="commercial";
   }
   
   public CargoPlane(String n, String t)
   {
      super(n, 727);
      type = t;
   }
   
   public String getType() 
   {
      return(type);
   }
   public void displayProperties()
   {
      System.out.println(super.getCallNumber());
      System.out.println("Very Fast");
      super.displayProperties();
   }
   
   public boolean equals(Object o)
   {
      System.out.println("Fancy Plane");
      CargoPlane cpThis = (CargoPlane)this;
      CargoPlane cpThat = (CargoPlane)o;
      
      if(!(o.getClass().equals(this.getClass()))) System.out.println("crashing"); else System.out.println("phew, not crashing");
      return(cpThis.getName().equals(cpThat.getName()));
   }
}