public class Wolf extends Canine 
{
	   public Wolf(double w, String color)
      {
	     super(w, color);
	   }
	   public String toString()
      {
	     return "\nWolf " + this.getColor() + 
               " " + super.toString();
	   }   
}
