public class QuizPrep
{
   public static void main(String[]args)
   {
   
      
      int [] b = {9, 3, 2};
   
      System.out.println(whichSumIsLarger(b));
     
   }
   public static int whichSumIsLarger(int [] myArr)
   {
      int i = 0;
      int sumEven = 0;
      int sumOdd=0;
      
      for(i=0; i<myArr.length; i++)
      {  
         if(myArr[i]%2==0)
            sumEven = sumEven+myArr[i];
         
      
         else if(myArr[i]%2!=0)
            sumOdd= sumOdd+myArr[i];   
      }
      
      if(sumOdd>sumEven)
      {
         System.out.println("Odd");
         return(3);
      }
      else if(sumOdd<sumEven)
      {
         System.out.println("Even");
         return(2);
      }
      else
      {
         System.out.println("Tie");
         return(7);
      }
         

   }
   
}