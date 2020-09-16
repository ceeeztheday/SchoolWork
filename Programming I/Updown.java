public class Updown
{
   public static void main(String[]args)
   {
   
      int [] arr = {10, 9, 8, 7};
   
   
      int i = 0;
      boolean up = true;
      boolean down = true;
   
      //up
      for(i=0; i<arr.length-1; i++)
      {
         if(arr[i]>=arr[i +1])
         {
         up=false; 
         }
      }
      
      if(up == true)
      {
         System.out.println("UP");
      }
   
      //down
      for(i=0; i<arr.length-1; i++)
      {
         if(arr[i]<=arr[i+1])
         {
            down=false;
         }
      }
      
      if(down==true)
      {
         System.out.println("DOWN");
      }
      
       System.out.println("NEITHER"); 
      
   }
} 