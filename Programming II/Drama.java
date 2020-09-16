public class Drama extends Movie 
{
   //data members
   private int daysLate;
   
   //constructors
   public Drama (String name, String rating, int id) 
   {
      super(name, rating, id);
   }
   
   //get and set methods
   public int getDaysLate() 
   {
      return(this.daysLate);
   }
   
   public void setDaysLate(int daysLate) 
   {
      this.daysLate = daysLate;
   }
   
   //auxiliary methods
   @Override
   public double calcLateFees(int numDaysLate) 
   {
      return(4.00 * daysLate);
   }
   
   @Override
   public boolean equals(Object obj) 
   {
      boolean result = true;
      if(obj == null)
         return(false);
      if(this.getClass() != obj.getClass())
         return(false);         

      Drama otherObject = (Drama)obj;
      
      return(this.getName().equals(otherObject.getName()) &&
         this.getRating().equals(otherObject.getRating()) &&
         this.getID() == otherObject.getID());       
   }
   
   @Override
   public String toString() 
   {
      return("Movie: " + this.getName() +
             "\nID: " + this.getID() +
             "\nRating: " + this.getRating() +
             "\nDays Late: " + this.getDaysLate() +
             "\nLate Fee: " + calcLateFees(daysLate));
   }
}