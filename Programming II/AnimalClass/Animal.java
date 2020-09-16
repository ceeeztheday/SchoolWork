public class Animal
{
   private double weight;
   private int numLegs;
   public static int animals;
   
   public Animal(double w)
   {
      this.weight = w;
      this.numLegs = 6;
   }
   public Animal(double w, int nl)
   {
	   this(w);
	   numLegs = nl;
      animals++;
   }
   
   public boolean equals(Object that)       
   {   
      if(!(that.getClass() == this.getClass()))
	      return false;
         
	   Animal cthat = (Animal) that;
      
	   return ((weight == cthat.weight) && 
              (numLegs == cthat.numLegs));
   }
   
   public void displayProperties()
   {
	   System.out.println("Animal " + weight); 
   }
    
   public String toString()
   {
	   return "\nAnimal " + weight + 
             " " + numLegs;
   }
}
