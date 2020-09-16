public class SeriesOps extends Series
{
   public int op1(int[] arr)
   {
      return sum(arr)/arr.length;
   }
   
   public int op2(int n)
   {
      int num = 1;
      if(n>0)
         return prod(nArray(n));
      else
         return num;
   }
   
   public int op3(int n)
   {
      int num = 1;
      if(n>0)
      {
         int [] nums = super.nArray(n);
         return sum(nums);
      }
      else
         return num;
   }
   
   public int [] nArray(int n)
   {
      int [] r = new int[n];
      r[0] = 1;
      for(int i = 1; i<n; i++)
         r[i] = r[i-1]+1;
      return r;
   }
   
   
      
}