import java.util.Arrays;

public class Scrabble
{
   static String S;
   static int [] B;
   static int count;
   
   public static void main (String [] args)
   {
      S = "YRTGLEA";
      bt(-1);
      B = new int[S.length()];
   }
   public static boolean promising(int q)
   {
      return(q < S.length());
   }
   public static boolean validSolution(int q)
   {
         return q >= 0;

   }
   public static void bt( int curPos )
   { 
      if( !promising(curPos) )
      {
         B[curPos] = -1;   //reset.  keeps display clean
         return;
      }
      else
      {
         if( validSolution(curPos) )
         {
            count++;
            //System.out.println( Arrays.toString(B) );
            System.out.println(count + ": ");
            for(int i = 0; i <= curPos; i++)
            {
               System.out.println(S.charAt(B[i]));
            }
            System.out.println();
            if(curPos == S.length() - 1)
               return;
         }
         curPos++;       //advance to next char
         for( int c=0; c < B.length; c++ ) 
         {
            B[curPos] = c;
            bt( curPos );            
         }
      }
   }
}