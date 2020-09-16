//A Single-Game Solution
public class TicTacToeTestApp_v2
{
   public static void main(String [] args)
   {
      TicTacToe_v2 ttt = new TicTacToe_v2(); //instantiate class

      playGame(ttt); //run game

   }
   /************************* RUN GAME ****************************/
   public static void playGame(TicTacToe_v2 ttt)
   {
      while(ttt.getCount() < 9 && ttt.getContinueGame() == true)
      {
         if(ttt.getContinueGame())
            ttt.turn1();
         if(ttt.getContinueGame())
            ttt.turn2();
      } //end while loop
      
      //Loop terminates. Test for a winner or a draw
      if(ttt.isWinnerX())
         System.out.println("Congratulations. Player X is the winner.");
      else if(ttt.isWinnerY())
         System.out.println("Congratulations. Player Y is the winner.");
      else
         System.out.println("The game ended in a draw.");
         
      System.out.println("Stats: " +
                         "Player X wins: " + ttt.getWinXCount() +
                         "\tPlayer O wins: " + ttt.getWinYCount() +
                         "\tDraws: " + ttt.getDrawCount());
         
   } //end method playGame()
   /*************************END OF CLASS*********************/
}