public class MethodSumNums
{
   public static void main (String [] args)
   {
      //variable declaration
      int [] arr = {9, 3, 10};
      int sum;
      int product;
      int max;
      int min;
      
      //logic 
      sum = SumNums(arr);
      product = Multi(arr);                
      max = maxNum(arr);
      min = minNum(arr);
      
      //output 
      System.out.println(sum);
      System.out.println(product);
      System.out.println(max);
      System.out.println(min);
      display(arr);
   }
    //Add  
   public static int SumNums(int []a)
   {
       int sum = 0;
       int i = 0;
         
       for(i=0; i<a.length; i++)
       {
          sum = sum + a[i];
       }
         
       return(sum);    
   }
   
   
   //Multi
   public static int Multi(int []a)
   {
      int product = 1;
      int i = 0;
      
      for(i=0; i<a.length; i++)
      {
         product = product * a[i];
      }
      
      return(product);
   }
   
   //max
   public static int maxNum(int [] a)
   {
      int i = 0;
      int maxValue = a[0];
      
      for(i=0; i<a.length; i++)
      {
         if(maxValue<a[i])
         maxValue = a[i];  
      }
      
      return(maxValue);
   }
   
   //min
   public static int minNum(int [] a)
   {
      int i = 0;
      int minValue = a[0];
      
      for(i=0; i<a.length; i++)
      {
         if(minValue>a[i])
            minValue = a[i];
         
      }
      return(minValue);  
   }
   
   //display
   public static void display(int []a)
   {
      int i = 0;
      
      for(i=0; i<a.length; i++)
      {
         System.out.println(a[i]);
      }
   }
               
}