public class ConditionalTestingMethods_1
{
   public static void main(String [] args)
   {
      int q = 3, m = 9, r = 5;
      int [] intArr_1 = {3, 9};
      int [] intArr_2 = {9, 5};
      int largest = 0;
      
      largest = largestOfTwo(r, q);
      System.out.println("\nIn the first test, the largest value is: " + largest);
      
      largest = largestOfTwo(q, m);
      System.out.println("\nIn the second test, the largest value is: " + largest);
     
      largest = largestOfTwo(intArr_1);
      System.out.println("\nIn the first test, the largest value is: " + largest);
      
      largest = largestOfTwo(intArr_2);
      System.out.println("\nIn the second test, the largest value is: " + largest);
   }
   public static int largestOfTwo(int x, int y)
   {
      if(x > y)
         return(x);
      else
         return(y);
   }
   
   public static int largestOfTwo(int [] arr)
   {
      if(arr[0]>arr[1])
         return(arr[0]);
      else
         return(arr[1]);
   }
}