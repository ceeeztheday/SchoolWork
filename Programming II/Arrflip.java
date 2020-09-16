public class Arrflip
{
	public static void main(String [ ] args)
   {
      int[][] arr ={{1,2,3,4},
                    {4,5,6,5},
                    {7,8,9,5},
                    {1,3,4,5}};
      int row = 0;
      int col = 0;
                   
      for(row=0; row<arr.length; row++)
      { 
         for(col=arr.length-1; col>=0; col--)
         {
            System.out.print(arr[col][row]);

         }
         System.out.println();
      }
                   
                   
   }
}
   
   