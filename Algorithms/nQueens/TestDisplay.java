import javax.swing.JFrame;

public class TestDisplay
{
   int[][] A = new int[8][8];
   Display disp;
   public static void main(String[] args)
   {
      new TestDisplay().go();
   }
   public void go()
   {
      int sz = 800;
      disp = new Display(A);
      int dim = sz / A.length;
      if( dim > sz / A[0].length ) dim = sz / A[0].length;

      JFrame frame = new JFrame();
      frame.setSize(A[0].length*dim+64, A.length*dim);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(disp);
      frame.show();
      
      /* try setting values in our array */      
      while(true)
      {
         int r = (int)(Math.random()*A.length);
         int c = (int)(Math.random()*A[0].length);
         A[r][c] = (int)(Math.random()*256);
         sleep(10);
      }
   }
   public void sleep(int t)
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