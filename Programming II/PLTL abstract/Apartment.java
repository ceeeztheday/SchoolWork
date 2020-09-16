public class Apartment implements Structure
{
   private int floor;
   private boolean[][] floorPlan;
   
   @Override
   public void numOfFloors(int n)
   {
      this.floor = n;
      this.floorPlan= new boolean [n][n];
      
   }
   
   public void bookRoom(int floor, int apartment, boolean isVacant)
   {
      this.floorPlan[floor][apartment]= isVacant;
   
   }
   
   public int vacancies()
   {  
      int count = 0;
      
      for(int i =0; i<floorPlan.length; i++)
      {
      
         for(int j =0; j<floorPlan[i].length; j++)
         {
            if(floorPlan[i][j]==false)
               count++;
            
         }
      }
      return(count);
   }   


}