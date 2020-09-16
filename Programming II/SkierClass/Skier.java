import java.io.*;
public class Skier
{
   private int id;
   private String scores;
   
   public Skier(int id)
   {
      this.id = id;
   }
   
   public void printSkierId()
   {
      System.out.println("Skier id: "+this.id);
   }
   
   public void setScores(String scores)
   {
      this.scores=scores;
   }
   
   public double sumScores()
   {
      double sum = 0;
      
      String [] sco = this.scores.split(" ");
      
      for(String s: sco)
      {
         sum = sum + Double.parseDouble(s);    
      }
      return(sum);   
   }
   
   @Override
   public boolean equals(Object otherObject)
   {
      if(otherObject == null)
      {
         return(false);
      }
      else if(this.getClass() != otherObject.getClass())
      {
         return(false);
      } 
      
      Skier otherSkier = (Skier)otherObject;
      if(this.sumScores() == otherSkier.sumScores())
    
         return(true);
      
      else
     
         return(false);
     
   }
}