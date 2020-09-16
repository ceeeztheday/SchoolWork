import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NQueens
{  
   static int[] B;      // column array
   static int[][] map;  // map column array to 2D board 
   static Display disp; // our Display object
   
   public static void main(String[] args)
   {
      int numQueens = Integer.parseInt(JOptionPane.showInputDialog(null, "How many queens"));
      
      /* set up our column array and init to -1 */
      B = new int[numQueens];
      for( int i=0; i<B.length; i++ ) B[i] = -1;            
      
      /* map array is 2D array used by Display class */
      map = new int[numQueens][numQueens];
      disp = new Display(map);
      
      /* size of window */
      int sz = 800;
      int dim = sz / map.length;
      if( dim > sz / map[0].length ) dim = sz / map[0].length;

      /* frame to put the panel in */
      JFrame frame = new JFrame();
      frame.setTitle("n-Queens Backtracking");
      frame.setSize(map[0].length*dim+64, map.length*dim);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(disp);
      frame.show();
      
      /* start backtracking. param is queen index 
         so queen #1 (first queen) is 0 - 
            we begin with queen 0 */
      bt(-1);
   }
   
   public static boolean promising(int q)
   {
      /* q is current Queen, index into array B */
      /* fix this with real nQueens promising code */
      //if( q == -1 || Math.random() > .65 ) return true;
      //return false;
      for(int i = 0; i < q; i++)
      {
         if(B[i] == B[q])
            return false;
         if(Math.abs(q - i) == Math.abs(B[q] - B[i]))
            return false;
      }
      return true;
   }
   public static boolean validSolution(int q)
   {
      if( q == B.length-1 )
         return true;
      else
         return false;
   }
   public static void bt( int curQueen )
   {
      /* we sleep to give the board a chance to redraw itself */      
      sleep(100); 
      if( !promising(curQueen) )
      {
         B[curQueen] = -1;   //reset.  keeps display clean
         return;
      }
      else
      {
         if( validSolution(curQueen) )
         {
            System.out.println( Arrays.toString(B) );
            fillMap(2);    // use index 2 for queen color
            sleep(2000);   // 2 second pause
            return;
         }
         curQueen++;       //advance to next queen
         for( int c=0; c<B.length; c++ ) 
         {
            B[curQueen] = c;
            fillMap(1); // B --> map
            bt( curQueen );            
         }
         B[curQueen] = -1;  //reset.  keeps display clean
         fillMap(1);
      }
   }
   
   public static void fillMap(int idx)
   {
      for( int i=0; i<B.length; i++ ) 
      {
         for( int j=0; j<map[0].length; j++ ) 
         {
            if( j != B[i] ) 
            {
               map[i][j] = 0;
            }
            else map[i][j] = idx;         
         }
      }
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