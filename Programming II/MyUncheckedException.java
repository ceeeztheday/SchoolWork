public class MyUncheckedException extends RuntimeException
{
   //write constructor(s)
   public MyUncheckedException()
   {
      this("An Unchecked Exception has occurred"); //send message to single arg constructor below  
   }
   public MyUncheckedException(String msg)   //send message to parent [Runtime Exception Class]
   {
      super(msg);
   }
}