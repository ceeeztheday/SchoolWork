public class Quiz4_Fall_2016_1
{
   public static void main(String [] args)
   {
      int [ ] a = {12, 51, 33, 92, 45};
      int [ ] b = {67, 83, 4, 99, 73, 12, 13};
      int [ ] c = {45, 23, 19, 84};
      int [ ] d = {1, 2, 3, 4, 5, 6, 7};
      System.out.print("displayReverse(a) produces: ");
      displayReverse(a);
      System.out.print("\ndisplayReverse(b) produces: ");
      displayReverse(b);
      System.out.print("\ndisplayReverse(c) produces: ");
      displayReverse(c);
      System.out.print("\ndisplayReverse(d) produces: ");
      displayReverse(d);
      }
   public static void displayReverse(int [ ] setOfInts)
   {
      int i = 0;
      for(i=setOfInts.length-1; i>0; i--)
      {
         System.out.println(setOfInts[i]);
      }
   
   
   
   
   
   
   
   
   }//end method displayReverse
}//end class
   /*SAMPLE PROGRAM OUTPUT
   displayReverse(a) produces: 45 92 33 51 12
   displayReverse(b) produces: 13 12 73 99 4 83 67
   displayReverse(c) produces: 84 19 23 45
   displayReverse(d) produces: 7 6 5 4 3 2 1
   */
   