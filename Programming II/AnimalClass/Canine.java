public class Canine extends Animal
{
   private String color;
   
   public Canine (double w, String c)
   {
   	super(w, 4);
   	color = c;
   } 
   public String getColor()
   {
	   return color;
   }
    
   public boolean equals(Object that)
   {
   	System.out.print("In Canine, equals == ");
      
      if( that.getClass() != this.getClass() )
   	    return true;
          
   	Canine cthat = (Canine) that;
      
   	return super.equals(that) &&  
             color.equals(cthat.color);
   }
   public String toString()
   {
      return "\nCanine " + color + 
             " " + super.toString();
   }
   
   public void displayProperties()
   {
	   System.out.println("Canine " + color); 
   }
}
