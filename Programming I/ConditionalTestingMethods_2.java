public class ConditionalTestingMethods_2
{
   public static void main(String [] args)
   {
      int q = 3, m = 9, r = 5;
      int [] intArr_1 = {3, 9, 5};
      int [] intArr_2 = {5, 4, 11};
      int largest = 0;
      
      largest = largestOfThree(r, q, m);
      System.out.println("\nIn the first test, the largest value is: " + largest);
      
      largest = largestOfThree(q, r, m);
      System.out.println("\nIn the second test, the largest value is: " + largest);
      
      largest = largestOfThree(intArr_1);
      System.out.println("\nIn the first test, the largest value is: " + largest);
      
      largest = largestOfThree(intArr_2);
      System.out.println("\nIn the second test, the largest value is: " + largest);
     
   }
   public static int largestOfThree(int x, int y, int z)
   {
      if(x > y && x > z)
         return(x);
      else if(y > x && y > z)
         return(y);
      else
         return(z);  
   }
   public static int largestOfThree(int [] arr)
   {
      if(arr[0] > arr[1] && arr[0] > arr[2])
         return(arr[0]);
      else if(arr[1] > arr[0] && arr[1] > arr[2])
         return(arr[1]);
      else
         return(arr[2]); 
   }

}