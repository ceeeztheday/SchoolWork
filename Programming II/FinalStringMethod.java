public class FinalStringMethod
{
   public static void main (String [] args)
   {
      char [] x = {'c', 'b', 'a', 'd', 'f', 'g'};
      char [] z = {'d', 'a', 'g', 'f', 'c', 'b'};
      
      char [] n;
      
      for(int i = 0; i < z.length; i++)
      {
         x = x.replace(z.charAt + " "," ");
      }
      if(x.length == 0)
         System.out.println(True);
      else
         System.out.println(False);
   }
}