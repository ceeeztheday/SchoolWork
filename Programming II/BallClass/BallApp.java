public class BallApp
{
  public static void main(String[] args)
  {
    Softball a = new Softball();
    Ball[] b = { new Ball(), new Baseball(), a, new Baseball("hard ball") };
    Softball b2 = new Softball(5);
    Softball[] sb = { new Softball(), b2 };
 
    b[1].hit();
    sb[0].hit();
    ((Baseball) sb[1]).hit();

    for (int i = 0; i < b.length; i++)
    {
      System.out.println(b[i].toString());
      System.out.println(b[i].getVelocity());
    }
    
    System.out.println(Baseball.fans);
    System.out.println(Softball.items);  
  }
}

