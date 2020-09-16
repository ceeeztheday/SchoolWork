import java.util.*;
public class TicTacToe extends Game implements Board
{
   private char [][] board;
   
   public TicTacToe(String s, int val)
   {
      super(s, val);
   }
   @Override
    public void clear(){}
   
   @Override
    public void create(int r, int c)
    {
      board = new char [r][c];
      
      for(int row = 0; row<board.length; row++)
      
         for(int col = 0; col<board[row].length; col++)
         
            board[row][col]='_';
         
    }
    
    @Override
   public void play(int p)
   {
      int row = 0;
      int col = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a row: ");
      row = input.nextInt();
      System.out.println("Enter a col: ");
      col = input.nextInt(); 
      
      if(p ==1)
         board [row][col]= 'X'; 
      else
         board [row][col]='O';
   }
   
   @Override
    public void printGameInfo()
   {
      super.printGameInfo();
      
      for(int row = 0; row<board.length; row++)
      {
         for(int col = 0; col<board[row].length; col++)
         {
         
            System.out.println(board[row][col] + " ");
         }
      }
            System.out.println();
         

   }

   



}