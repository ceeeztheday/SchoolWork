import java.util.Scanner;
public class array
{
   public static void main(String[]args)
   {  //var + scanner
      Scanner input = new Scanner(System.in);
      int i = 0;
      int n = 0;
      int maxValue = 0;
      int maxIndex = 0;
      int minValue = 0;
      int minIndex = 0;
      //create array
      System.out.println("Please enter the number of elements within the array: ");
      n = input.nextInt();
      int [] arr = new int [n];
      //zero array
      for(i=0; i<arr.length; i++)
      {
         arr [i]=0;
      }
      //load array
      for(i=0; i<arr.length; i++)
      {
         System.out.println("Enter integer " + (i+1) +" : ");
         arr [i] = input.nextInt();
      }
      //display array forward
      System.out.println("This is the array forward:");
      for(i=0; i<arr.length; i++)
      {
         System.out.println(arr [i]);
      }
      //display array reverse
      System.out.println("This is the array in reverse");
      for(i=arr.length-1; i>=0; i--)
      {
         System.out.println(arr [i]);
      }
      //max and max index
      maxValue= arr[0];
      for(i=0; i<arr.length; i++)
      {
         if(maxValue<arr [i])
         {
            maxValue = arr [i];
            maxIndex = i;
         }
      }
      System.out.println("The max value is: " + maxValue);
      System.out.println("The max values index is: " +maxIndex);
      //min and min index
      minValue = arr [0];
      for(i=0; i<arr.length; i++)
      {
         if(minValue>arr[i])
         {
            minValue=arr[i];
            minIndex=i;
         }
       }
       System.out.println("The min value is: " + minValue);
       System.out.println("The min values index is: " + minIndex);
   }
}      
      