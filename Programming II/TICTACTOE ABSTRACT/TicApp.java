public class TicApp
{
   public static void main(String[]args)
   {
   



      TicTacToe t = new TicTacToe("TicTacToe", 2);
      t.create(3, 3);
      t.printGameInfo();
      t.play(1);
      t.play(2);
      t.printGameInfo();
      System.out.println();
      t.play(1);
      t.play(2);
      t.printGameInfo();

   }
}