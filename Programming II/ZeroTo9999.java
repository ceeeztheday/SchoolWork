import java.util.Scanner;
public class ZeroTo9999
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      int countArr = 0;
      int i = -1;
      int j = 0;
      int m= 0;
      boolean isPresent = true;
      int [] arr = new int [10000];
      
      for(m=0; m<arr.length; m++)
      {
         arr[m]= -1;
      }
      
      while(isPresent == true)
      { 
         countArr = 0;
         i++;
         System.out.println("Please enter an int:");
         arr[i] = input.nextInt();
         
       
     
         for(j=0; j<arr.length; j++)
         {
            if(arr[i] == arr[j])
            {
               countArr++;
            }
            
            if(countArr>=2)
            {
               isPresent= false;
            }
         }    
      }
      System.out.println("You entered "+ i + " numbers before repeating a number."); 
   }
}
