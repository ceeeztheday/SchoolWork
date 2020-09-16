public class Movie
{
   //data members
  private String name;
  private String rating;
  private int id;
   
   public Movie()
   {
      name = "";
      rating = "";
      id = 0;
   }
   
   public Movie(String n, String r, int identification)
   {
      name = n;
      rating = r;
      id = identification;
   }
   
   //accessor-mutator methods
   public void setName(String n){name = n;}
   public void setRating(String r){rating = r;}
   public void setID(int identification){id = identification;}
   public String getName(){return name;}
   public String getRating(){return rating;}
   public int getID(){return id;}
   
   public double calcLateFees(int daysLate)
   {
      return(2.00 * daysLate);
   }
}