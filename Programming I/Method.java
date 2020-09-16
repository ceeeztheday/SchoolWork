public class Method
{
   public static void main(String[] args)
   {
      int a = 2;
      int b = 3;
      int c = 4;
      int [] Arr_1 = {1, 3, 45};
      int [] Arr_2 = {34, 3, 1};
      int largest;
      
      largest = biggestOfThree(a, b, c);
      System.out.println(largest + " is the biggest in test one");
   
      largest = biggestOfThree(Arr_1);
      System.out.println(largest + " is the biggest arr1 number");
   
      largest = biggestOfThree(Arr_2);
      System.out.println(largest + " is the biggest arr2 number");
   }
   public static int biggestOfThree(int x, int y, int z)
   {
      if(x>y && x>z)
         return(x);
      if(y>x && y>z)
         return(y);
      else
         return(z);   
   }
   public static int biggestOfThree(int [] arr)
   {
      if(arr[0]>arr[1]&&arr[0]>arr[2])
         return(arr[0]);
      if(arr[1]>arr[0]&&arr[1]>arr[2])
         return(arr[1]);
      else
         return(arr[2]);
         
    }
}
         
   
   