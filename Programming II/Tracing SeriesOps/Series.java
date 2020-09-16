public class Series
{
   public int sum(int[] elements)
   {
      int res = 0,i;
      for(i = 0; i < elements.length; i++)
         res+=elements[i];
      return res;
   }
   
   public int prod(int [] elements)
   {
      int res = 1;
      for(int elem: elements)
            res = res*elem;
      return res; 
   }
   
   public int [] nArray(int n)
   {
      int [] r = new int [n];
      for(int i = 0; i<n; i++)
         r[i]=n;
      return r;
   }
}