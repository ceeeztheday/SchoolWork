import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class Display extends JPanel implements ActionListener
{
   int[][]   m;
   Timer timer;
   Color[] color = {new Color(0,0,0), new Color(255,0,0), new Color(0,255,0), new Color(0,0,255), new Color(255,255,0), new Color(255,128,0), new Color(0,255,255), new Color(255,255,255)};  
   
   public Display(int[][] A)
   {
      m = A;
      timer = new Timer(100, this);
      timer.start();       
   }
      
   public void actionPerformed(ActionEvent e) 
   {
      repaint();
   }

   public void paint (Graphics g)
   {
      super.paint(g);
      
      if( m == null || m.length == 0 || m[0].length == 0) 
      {
         return;
      }
      int hStep = getHeight() / m.length;
      int wStep = getWidth() / m[0].length;
      //System.out.println( hStep + ", " + wStep );
      for( int i=0; i<m.length; i++ )
      {
         for( int j=0; j<m[i].length; j++ )
         {
            g.setColor(color[m[i][j] % color.length]);
            g.fillRect(wStep * j + 1, hStep * i + 1, wStep-2, hStep-2);
         }
      }
   } 
}