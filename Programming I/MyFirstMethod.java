public class MyFirstMethod
{   
   public static void main(String[]args)
   {
      int a = 3, b = 2, c = 1;
   
      int biggest = largestOfTwo(b, a);//method call
   
      System.out.println(biggest);
      
    }
    public static int largestOfTwo (int x, int y)
    {
      if(x > y)
      {
          return(x);
      }   
      else 
      {
          return(y);
      }    
          
  }  
}
      
   
