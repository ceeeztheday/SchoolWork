public class sumOdds
{  
   public static void main (String[]args)
   {
      int num = 3;
      int count = 0;  
         
         while(num!=1)
         {
            if(num%2==0)
            {
              num = num / 2; 
               count++;
            }
            
            else if(num%2!=0)
            {
               num = num * 3 + 1; 
               count++;
            }
          }
        System.out.println(count);    
      
      
      
      
      
      
      
   }
}
         
