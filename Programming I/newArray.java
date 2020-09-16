import java.util.*;
public class newArray
{

   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int i = 0;
      int size = 8;
      int increment = 4;
      int start = 5;
      int k = 0;
      
      
      int [] a = new int [size];
      a[0] = start;
         
      for(i=0; i<a.length-1; i++)
      {  
         
         
         
            a[k+1]=a[k] +increment;
            k++;
            System.out.println(a[i]);
                       
         
         }
         
         
      }
      }

    

      
      
      
      
      
