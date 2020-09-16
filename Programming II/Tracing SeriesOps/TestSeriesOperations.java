public class TestSeriesOperations
{
   public static void main (String[]args)
   {
      SeriesOps so = new SeriesOps();
      int [] numbers ={1,2,3,4,5};
      System.out.println(so.sum(numbers));
      System.out.println(so.prod(numbers));
      System.out.println(so.op1(numbers));
      System.out.println(so.op2(5));
      System.out.println(so.op3(6));
   }
}
   