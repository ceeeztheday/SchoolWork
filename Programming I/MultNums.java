public class MultNums
{
   public static void main(String[]args)
   {
      int [] arr1 = {2, 3, 4};
      int [] arr2 = {1, 3, 5};
      int [] arr3 = {2, 5, 6};
      
   
      System.out.println("The product is: "+ product(arr1 arr2));
      System.out.println("The larger of the two products is: " +largestProduct(arr1, arr2));
   }
   
   public static int product(int [] a)
   {
      int i = 0;
      int prod = 1;
      
      for(i=0; i<a.length; i++)
      {
         prod = prod *a[i];
      }
      
      return(prod);
   }
   
   public static int largestProduct(int [] a, int [] b)
   {
      /*int i = 0;
      int prod1 = 0;
      int prod2 = 0;
      largestProd = 0;
      
     /* for(i=0; i<a.length; i++)
      {
         prod1 = prod1 * a[i];
      }
      
      for(i=0; i<b.length; i++)
      {
         prod2 = prod2 * b[i];
      }
      for(i=0; i<c.length; i++)
      {
         prod3 = prod3 *c[i];
      */
     /* prod1 = product(a);
      prod2 = product(b);
      
      if(prod1> prod2)
         return(prod1);
      
      else
         return(prod2);
         */
         
         if(product(a)>product(b))
            return(product(b));
         else
            return(product(a));
         
      
   
   }
   
     
}