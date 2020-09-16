public class product2arrays
{
   public static void main(String[]args)
   {
      int [] a = { 3, 4, 7};
      int [] b = { 2, 8};
      int   [] [] ab = { {3, 4, 7},
                         {2, 8} };  
      
      
      products(a, b);
      newarrayproducts(a, b);
     
      
   }
   public static void products(int [] x, int [] y)
   {
         
      int i = 0;
      int j = 0;
      
      
         for(i=0; i<x.length; i++)
         {
      
            for(j=0; j<y.length; j++)
            { 
              System.out.println( x[i] * y[j]);
            }
         }
      
    }
    public static int productsSum(int [] x, int [] y)
    {
         
      int i = 0;
      int j = 0;
      int prod = 1;
      int sum = 0;
      
         for(i=0; i<x.length; i++)
         {
      
            for(j=0; j<y.length; j++)
            { 
              sum= sum + x[i] * y[j];
                         
            }
         }
        return(sum);
   
   }
   public static int [] newarrayproducts(int [] x, int [] y)
   {
      int k = 0;   
      int i = 0;
      int j = 0;
      int [] prod = new int [x.length * y.length];
      
      
         for(i=0; i<x.length; i++)
         {
      
            for(j=0; j<y.length; j++)
            { 
              prod[k] = x[i] * y[j];
              k++;
            }
         }
         
         return(prod);
      
    }
            


   
}

