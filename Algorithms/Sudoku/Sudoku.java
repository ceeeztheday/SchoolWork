import java.util.Arrays;
import javax.swing.JFrame;

public class Sudoku
{
   static Display disp; // our Display object   
   static int[][] B;    // our puzzle board
   
   public static void initDisplay(Display disp, int sz, int[][] map)
   {
      int dim = sz / map.length;
      if( dim > sz / map[0].length ) dim = sz / map[0].length;

      /* frame to put the panel in */
      JFrame frame = new JFrame();
      frame.setTitle("Sudoku Backtracking");
      frame.setSize(map[0].length*dim+64, map.length*dim);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(disp);
      frame.show();
   }
   public static void main(String[] args)
   {
      for( int i=0; i<PuzzleData.puzzleList.length; i++ )
      {
         B = PuzzleData.puzzleList[i];
         System.out.println( "\nPuzzle #" + (i+1) );
         print(B);
         disp = new Display(B, true);    
         initDisplay(disp, 800, B); 
         bt(0,0);    
      }
   }
   public static void print(int[][] A)
   {
      for( int i=0; i<A.length; i++ ) 
      {
         for( int j=0; j<A[i].length; j++ ) 
         {
            if( j>0 && j%3==0 ) System.out.print(" | ");
            if( A[i][j] > 0 ) // 0 is blank 
               System.out.print(A[i][j] + " ");
            else
               System.out.print("_ ");
         }
         System.out.println();         
         if( i>0 && (i-2)%3==0 && i<A.length-1 ) 
         {
            for( int k=0; k<8; k++ ) System.out.print("---");
            System.out.println();
         }  
      }
      System.out.println();
      //System.out.println(Arrays.deepToString(A));
   }
   public static boolean validSolution(int r, int c)
   {
      return r == B.length;
   }
   public static boolean promising(int r, int c)
   {
      return true;
   }
   public static void bt(int r, int c)
   {
      sleep(200);
      while( c>=B[r].length || B[r][c] > 0 )
      {
         c++;
         if( c>=B[r].length ) 
         {
            c = 0;
            r = r + 1;
            if( validSolution(r, c) )
            {
               //print(B);
               return;
            }
         }
      }
      for( int v=1; v<=B.length; v++ ) 
      {
         B[r][c] = v;
         if( promising(r, c) ) 
         {
            bt(r, c+1);
         }
      }
      B[r][c] = 0;
      
      
      
   }
   public static void sleep(int t)
   {
         try
         {
            Thread.sleep(t);
         }
         catch(InterruptedException ie)
         {
            System.out.println(ie);
         }
   }
}