public class Ball
{
  private int velocity = 2;
  public static int c = 19;
  
  public Ball()
  {
    System.out.println("Ball constructor " +
                        this.velocity + " " +
                        c);
    this.velocity++;
    c++;
  }
 
  public Ball(int x)
  {
    System.out.println("Ball constructor " +
                        this.velocity + " " + 
                        c);
    this.velocity = 0;
    c++;
  }

  public void hit()
  {
    System.out.println("Hit a mile!");
  }

  public static int getVelocity()
  {
    return(c);
  }

  @Override
  public String toString()
  {
    return("class Ball velocity = " + 
            this.velocity);
  }
}
