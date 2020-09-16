public class LCS     //dynamic programming: combination of recursion and meshing with a table of arrays
{
   static String [][] memo;
      
   public static void main (String [] args)
   {
      String chars = "GATC";
      int sz = 10;
      String a = "";
      String b = "";
      memo = new String [sz + 1][sz + 1];
      for(int i = 0; i < sz; i++)
      {
         a = a + chars.charAt((int)(Math.random() * chars.length()));
         b = b + chars.charAt((int)(Math.random() * chars.length()));
      }
      String result = lcs(a, b, 0, 0);
      System.out.println( a + "\n" + b + "\n--------\n" + result);
   }
   public static String lcs(String a, String b, int aIdx,  int bIdx)
   {
      if(memo[aIdx][bIdx] != null)
         return memo[aIdx][bIdx];
      //System.out.println(aIdx + "," + bIdx);
      if(aIdx == a.length() || bIdx == b.length())
      {
         memo[aIdx][bIdx] = "";
         return "";
      }
      
      if(a.charAt(aIdx) == b.charAt(bIdx))
      {
         String temp = a.charAt(aIdx) + lcs(a, b, aIdx + 1, bIdx);
         return a.charAt(aIdx) + lcs(a, b, aIdx + 1, bIdx + 1);
      }
         
      String aTemp = lcs(a, b, aIdx + 1, bIdx);
      String bTemp = lcs(a, b, aIdx, bIdx +1);
      
      if(aTemp.length() >= bTemp.length())
      {
         memo[aIdx][bIdx] = aTemp;
         return aTemp;
      }
      else
      {
         memo[aIdx][bIdx] = bTemp;
         return bTemp;
      }
   }
}