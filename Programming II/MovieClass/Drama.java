public class Drama extends Movie
{
   private int daysLate;
   
   public Drama(String name, String rating, int id)
   {
      super(name, rating, id);
   }
   
   public int getDaysLate()
   {
     return(this.daysLate); 
   }
   
   public void setDaysLate(int daysLate)
   {
      this.daysLate = daysLate;
   }
   //auxillary method
   @Override
   public double calcLateFees(int numDaysLate)
   {
      return(4.00 * this.daysLate);
   }
   @Override
   public boolean equals(Object obj)
   {
      if(obj == null) //check it otherObject is blank
         return(false);
      else if(this.getClass() != obj.getClass()) //check for same class
         return(false);
      
      Drama otherObject = (Drama)obj; //cast otherObject
      
      return(this.getName().equals(otherObject.getName()) && //check if objects names are the same
             this.getRating().equals(otherObject.getRating()) &&  //check if rating is the same
             this.getID() == otherObject.getID()); //check if id is the same  

   }
   
   @Override
   public String toString()
   {
      return("Movie: "+ this.getName() +
             "\nID: "+ this.getID() +
             "\nRating: "+ this.getRating() +
             "\nDays Late: "+ this.getDaysLate() +
             "\nLate Fee: " + this.calcLateFees(daysLate));
   }
}