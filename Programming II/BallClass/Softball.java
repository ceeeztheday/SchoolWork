public class Softball extends Baseball
{
  public static int items = 3;
     
  public Softball()
  {
    super();
    System.out.println("Softball " +
                       "constructor.");
    items++;
  }

  public Softball(int items)
  {
    Softball.items = items;
  }

  @Override
  public String toString()
  {
    return("Items = " + items);
  }
  //METHOD BELOW IS FOR TESTING BALLAPP LINES 10 TO 12 ONLY. IT IS NOT IN THE TRACING EXAMPLE
  public void hit()
  {
      System.out.println("IN SOFTBALL HIT");
  }
}
