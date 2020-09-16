public abstract class Game
{
   private String name;
   private int players;
   
   protected Game(String n, int p)
   {
      this.name = n;
      this.players = p;
   }
   
   public abstract void play(int p);
   
   public void printGameInfo()
   {
      String s = this.name + " Players: "
      + this.players;
      System.out.println(s);
   }
}