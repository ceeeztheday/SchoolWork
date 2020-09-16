public class Loop12
{
   public static void main(String[] args)
   {
      int i = 0;
      int [] m = {9, 13, 22, 5, 7};
      
      
      for (i=0; i<m.length && m[i]<10; i++)
         if(m[i]<10)
      {                                      
         System.out.println(m[i]);
      }  
      
      System.out.println(m[i]);
      }
} 
