import java.util.Scanner;

public class TicTacToeApp {

   public static void main (String[] args)
   {
      String YN = " ";
      
      Scanner kbd = new Scanner(System.in);
      System.out.println("This is the Tic Tac Toe game" +
         "\nPlayer 1 will be using the X" +
         "\ncharacter in the game and player" +
         "\nPlayer 2 will be using the O" +
         "\nat the player's turn, the player" +
         "\nwill choose only the location he/she"+
         "\nwishes to play");
         
      TicTacToe ticTacToe = new TicTacToe();
      boolean keepPlaying = true;
   
      while(keepPlaying)
      {
         ticTacToe.play();
         ticTacToe.displayScore();  
         System.out.println("do you want to play another game? Y or N");
         YN = kbd.nextLine();
         if(YN.contains("Y") || YN.contains("y")){
            ticTacToe.resetBoard();
            keepPlaying = true;
            ticTacToe.setCount(0);
         }
         else
            keepPlaying = false;
      }
      System.out.println("Thanks for playing!"+ "\nFinal Score:");    
      ticTacToe.displayScore();  
   }
}

