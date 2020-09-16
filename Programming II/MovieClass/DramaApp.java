public class DramaApp
{
   public static void main(String [] args)
   {
      Drama movie1 = new Drama("In the Line Of Fire", "PG-13",23157);
      Drama movie2 = new Drama("Witness", "PG-13", 22989);
      movie1.setDaysLate(3);
      
      if(movie1.equals(movie2))
         System.out.println("You chose the same film");
      else
         System.out.println("You chose a different film");
         
      System.out.println("Movie 1 details are the following: \n"+ movie1);
}
}