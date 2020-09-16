public class xo
{
   public static void main (String [] args)
   
   {
    //variable declaration
      int [] val = {2, 7, 4, 8, 63};
      int [] a = {1, 2, 3, 4, 5};
      int [] b = {2, 8 , 14, 17, 93};
      int row=0;
      int col=0;
      int rightX = 5;
      //logic
      
      for(row = 0; row < 5; row++) 
      {    
         rightX--;
         
         for(col = 0; col < 5; col++)    
         {
            if(row == col || col == rightX)
               System.out.print('x');
            else
               System.out.print('o');
         }
         System.out.println();
      }
    }
 }
 
 
