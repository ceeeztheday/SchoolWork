import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class Display extends JPanel implements ActionListener
{
   int[][]   m;
   Timer timer;
   boolean drawText;
   Color[] color = {new Color(0,0,0), new Color(255,0,0),
      new Color(0,255,0), new Color(0,0,255), 
      new Color(255,0,255), new Color(255,255,0),
      new Color(0,255,255), new Color(255,255,255), 
      new Color(128, 128, 128), new Color(255, 128, 0)};
   
   public void setFont(int fIdx, int size, Graphics g)
   {
      String[] fontNames =
                GraphicsEnvironment 
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
      Font f = new Font(fontNames[fIdx], Font.BOLD, size);
      this.setFont(f);      
   }         
   public Display(int[][] A, boolean text)
   {
      drawText = text;
      m = A;
      timer = new Timer(100, this);
      timer.start();       
   }
   public Display(int[][] A)
   {
      drawText = false;
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
      setFont(0, hStep, g);
      
      //System.out.println( hStep + ", " + wStep );
      int pad = wStep / 6;
      
      for( int i=0; i<m.length; i++ )
      {
         for( int j=0; j<m[i].length; j++ )
         {
            if( !drawText )
            {
               g.setColor(color[m[i][j] % color.length]);
               g.fillRect(wStep * j + 1, hStep * i + 1, wStep-2, hStep-2);
            }
            else
            {
               g.setColor(Color.BLUE);
               if( m[i][j] > 0 )
                  g.drawString("" + m[i][j], wStep * j + 1 + pad, hStep * i + 1);
            }
         }
      }
   } 
}