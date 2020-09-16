public class GoingWhichWay
{
   public static void main(String [] args)
   {
      int [] arr1 = {3, 8, 17, 25, 89, 94};
      int [] arr2 = {77, 66, 55,33, 22, 11};
      int [] arr3 = {20, 30, 50, 40, 10, 5};
      int [] arr4 = {20, 30, 50, 60, 70, 90};
      char[] a = {'a', 'b', 'c', 'd'};
      int num = 3;
     
      
      
      System.out.println("arr1: ");
      System.out.println(goingWhichWay(arr1) );
      System.out.println();
      
      System.out.println("arr2: ");
      System.out.println(goingWhichWay(arr2) );
      System.out.println();
      
      System.out.println("arr3: ");
      System.out.println(goingWhichWay(arr3) );
      System.out.println();
      
      System.out.println("arr4: ");
      System.out.println(goingWhichWay(arr4) );
      System.out.println();
      
      multiples(a, num);
   }
   public static void multiples(char [] arr, int n)
   {
      int i = 0;
      int j = 0;
      int k = 0;
      char [] b = new char [arr.length * n];
      
      for(i = 0; i <arr.length; i++)
      {
        for(j=1; j<=n; j++)
        {
         b[k] = arr[i];
         k++; 
        } 
      }
      
     
   
   
   }
   public static int goingWhichWay(int [] myArray)
   {
      int i = 0;
      boolean increasing = true;
      boolean decreasing = true;
      
      //increasing
      for(i = 0; i < myArray.length - 1; i++)
      {
         if(myArray[i] >= myArray[i+1])
         {
             increasing = false;
            
         }
      }
      
      if(increasing == true)
      { 
         System.out.println("Increasing");
         return(111);
      }

      
   //decreasing
      for(i = 0; i < myArray.length - 1; i++)
      {
         if(myArray[i] <= myArray[i+1])
         {
             decreasing = false;
         } 
      }
      
            
      if(decreasing == true)
      {
         System.out.println("Decreasing");
         return(222);
      }
      else
      {
         System.out.println("Neither");
         return(333);
      }
      
      
   }
}
         
       

      
