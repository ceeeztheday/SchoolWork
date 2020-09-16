public class tester
{
   public static void main(String[]args)
   {
      int [] a = {9, 3, 45, 7, 23};
      int [] b = {12, 34, 45, 14};
      int [] c = {2, 5, 4, 8, 6, 7, 3, 4};
      
      displayUntil(a);
      displayUntil(b);
      displayUntil(c);
      
   }
   public static void displayUntil(int [] arr)
   {
      int i = 0;
      for(i=0; i<arr.length&& arr[i]<10; i++)
      {
         if(arr[i]<10)
         {
            System.out.println(arr[i]);
         }
      }
      if(i<arr.length)
      {
         System.out.println(arr[i]);
      }
   }
}
      
      
